package in.sp.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sp.app.Entities.Product;
import in.sp.app.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	public class ProductController {
	    @Autowired
	    private ProductService productService;

	    @GetMapping("/products")
	    public String listProducts(Model model) {
	        List<Product> products = productService.getAllProducts();
	        model.addAttribute("products", products);
	        return "Product";
	    }

	    @GetMapping("/addProducts")
	    public String addProductPage() {
	        return "addProduct";
	    }

}
}	
