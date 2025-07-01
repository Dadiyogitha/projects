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
                product.setProductName(rs.getString("product_name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setImage(rs.getString("image"));
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
    public String saveProduct(@RequestParam String productName, @RequestParam String description, @RequestParam double price, @RequestParam MultipartFile imageFile) throws ClassNotFoundException, SQLException, IllegalStateException, IOException {
        Connection conn = DbCon.getCon();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO products (product_name, description, price, image) VALUES (?, ?, ?, ?)"); 

            String imageName = UUID.randomUUID().toString() + "_" + imageFile.getOriginalFilename();
            imageFile.transferTo(new File("/path/to/images/" + imageName));

            pstmt.setString(1, productName);
            pstmt.setString(2, description);
            pstmt.setDouble(3, price);
            pstmt.setString(4, imageName);
            pstmt.executeUpdate();
            conn.close();
        
        return "redirect:/products";
    }

    }
