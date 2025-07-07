package in.sp.app.Controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.sp.app.Entities.Product;
import in.sp.app.Utils.DbCon;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/products")
    public String productList(Model model) throws ClassNotFoundException, SQLException {
        List<Product> products = new ArrayList<>();
        	Connection conn = DbCon.getCon();
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product");
             ResultSet rs = pstmt.executeQuery(); 

            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setDescription(rs.getString("description"));
                product.setImage(rs.getString("image"));
                product.setPrice(rs.getDouble("price"));
                product.setProductName(rs.getString("productname"));
                products.add(product);
             } 
             conn.close();
 
             model.addAttribute("products", products);
             return "products";
    }

  

	@GetMapping("/addProducts")
    public String addProductPage() {
        return "addProduct";
    }

    @PostMapping("/saveProduct")
    public String saveProduct( @RequestParam("description") String description, @RequestParam("imageFile") MultipartFile imageFile,@RequestParam("price") double price,@RequestParam("productname") String productname ) throws ClassNotFoundException, SQLException, IllegalStateException, IOException {
    	System.out.println("Received: " + productname);
          Connection conn = DbCon.getCon();
           PreparedStatement pstmt = conn.prepareStatement("INSERT INTO product ( description,image, price,productname ) VALUES (?, ?, ?, ?)"); 

            String imageName = UUID.randomUUID().toString() + "_" + imageFile.getOriginalFilename();
            imageFile.transferTo(new File("/path/to/images/" + imageName));
            pstmt.setString(1, description);
            pstmt.setString(2, imageName);
            pstmt.setDouble(3, price);
            pstmt.setString(4, productname);
            pstmt.executeUpdate();
            conn.close();
        
        return "redirect:/product/products";
    }

    }
