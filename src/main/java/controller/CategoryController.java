package controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Dao.CategoryDao;
import com.model.Category;
	 
	@Controller
	public class CategoryController 
	{
		@Autowired
	    CategoryDao categoryDao;
	  
	
	    @RequestMapping(value="AddCategory",method=RequestMethod.POST)
	    public String addCategory(@ModelAttribute("category")Category category,BindingResult result,Model m)
	    {
	    	
	        categoryDao.addCategory(category);
	         
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        m.addAttribute("categoryList",listCategory);
	         
	        return "redirect:/category";
	    }
	    
	    @RequestMapping(value="editCategory",method=RequestMethod.POST)
	    public String updateCategory(@ModelAttribute("category")Category category,BindingResult result,Model m)
	    {
	    	
	        categoryDao.updateCategory(category);
	         
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        m.addAttribute("categoryList",listCategory);
	         
	        return "redirect:/category";
	    }
	    
	    @RequestMapping(value="category",method=RequestMethod.GET)
	    public String showCategory(@ModelAttribute("category") Category category,  BindingResult result,Model m)
	    {
	        //Category category=new Category();
	        //m.addAttribute(category);
	         
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        
	        m.addAttribute("categoryList",listCategory);
	       
	        return "Category";
	    }
	     
	    @RequestMapping(value="updateCategory/{catId}",method=RequestMethod.GET)
	    public String updateCategory(@PathVariable("catId") int catId,Model m)
	    {
	        Category category=categoryDao.getCategory(catId);
	        m.addAttribute("category",category);
	        
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        m.addAttribute("categoryList",listCategory);
	        return "UpdateCategory";
	    }
	     
	    @RequestMapping(value="deleteCategory/{catId}",method=RequestMethod.GET)
	    public String deleteCategory(@PathVariable("catId")int catId,Model m)
	    {
	        Category category=categoryDao.getCategory(catId);
	        categoryDao.deleteCategory(category);
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        m.addAttribute("categoryList",listCategory);
	        return "redirect:/category";
	    }
	}