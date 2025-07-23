package in.ex.Student.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ex.Student.Entity.StudentData;
import in.ex.Student.Repository.StudentRespository;


@Controller
public class StudentController 
{
    @Autowired 
    StudentRespository s;
	@GetMapping("/openfirspage")
    public String openfirspage()
    {
    	return "register";
    }
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute StudentData stu,Model m)
    {
	StudentData b = s.save(stu);
	if( b != null)
	{
		m.addAttribute("success", "suc");
		return "login";
	}
	else
	{
		m.addAttribute("failure", "f");
	}
    	return "register";
    }
	
	@GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @PostMapping("/loginaction")
    public String loginUser(@RequestParam String name, @RequestParam String password, Model model) {
        
            List<StudentData> studentdata = s.findByNameAndPassword(name, password);
            if (studentdata != null && !studentdata.isEmpty()) {
            	StudentData student = studentdata.get(0); 
                model.addAttribute("student", student); 
                return "dashboard";
            } else {
                model.addAttribute("loginFailure", "Invalid name or password");
                return "login";
            }
			
        
    }

	
	
	@GetMapping("/showall")
    public String showall(Model m)
    {
		ArrayList<StudentData> students = (ArrayList<StudentData>) s.findAll();
		m.addAttribute("studentlist", students);
    	return "studentslist";
    }
	
	
	
}