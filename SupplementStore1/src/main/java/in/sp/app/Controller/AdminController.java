package in.sp.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sp.app.Entities.Product;
import in.sp.app.service.ProductService;


public class AdminController {
	@Controller
	@RequestMapping("/admin")
	public class ProductController {
	    @Autowired
	    private ProductService productService;

	    @RequestMapping("/products")
	    public String listProducts(Model model) {
	        List<Product> products = productService.getAllProducts();
	        model.addAttribute("products", products);
	        return "product_list";
	    }

	    @GetMapping("/products/add")
	    public String showAddProductForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "add_product";
	    }

}
}	
