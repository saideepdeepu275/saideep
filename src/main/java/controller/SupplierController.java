package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Dao.SupplierDao;
import com.model.Category;
import com.model.Supplier;

@Controller
public class SupplierController {
	 @Autowired
	    SupplierDao supplierDao;
	     
	    @RequestMapping(value="AddSupplier",method=RequestMethod.POST)
	    public String addSupplier(@ModelAttribute("supplier")Supplier supplier,Model m)
	    {
	        supplierDao.addSupplier(supplier);
	        
	        List<Supplier> listSupplier=supplierDao.retrieveSupplier();
	        m.addAttribute("supplierList",listSupplier);
	        return "redirect:/supplier";
	    }
	     
	    @RequestMapping(value="supplier",method=RequestMethod.GET)
	    public String showSupplier(@ModelAttribute("supplier")Supplier supplier, BindingResult result,Model m)
	    {
	         
	        List<Supplier> listSupplier=supplierDao.retrieveSupplier();
	        
		     
	        m.addAttribute("supplierList",listSupplier);
	        return "Supplier";
	    }
	     
	   
	    @RequestMapping(value="updateSupplier/{supId}",method=RequestMethod.GET)
	    public String UpdateSupplier(@PathVariable("supId") int supId,Model m,RedirectAttributes attributes)
	     {
	    	Supplier supplier=supplierDao.getSupplier(supId);
	    	attributes.addFlashAttribute("supplier",supplier);
	        List<Supplier> listSupplier=supplierDao.retrieveSupplier();
	        m.addAttribute("supplierList",listSupplier);
	        return "redirect:/supplier";
	    }
	     
	    @RequestMapping(value="/deleteSupplier/{supId}",method=RequestMethod.GET)
	    public String deleteSupplier(@PathVariable("supId")int supId,Model m,RedirectAttributes attributes)
	    {
	        
	    	Supplier supplier=supplierDao.getSupplier(supId);
		        supplierDao.deleteSupplier(supplier);
		        List<Supplier> listSupplier=supplierDao.retrieveSupplier();
		        m.addAttribute("supplierList",listSupplier);
		        return "redirect:/supplier";
	    }

}

