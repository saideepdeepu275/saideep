
package controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Dao.CategoryDao;
import com.Dao.ProductDao;
import com.Dao.SupplierDao;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;

@Controller
	public class ProductController
	{
		
		@Autowired
		ProductDao productDao;
		@Autowired
		
		CategoryDao categoryDao;
		
		@Autowired
		SupplierDao supplierDao;
	
		@RequestMapping(value="product",method=RequestMethod.GET)
		public String showProduct(@ModelAttribute("product")Product product ,BindingResult result,Model m)
		{
			System.out.println("show product");
		//	Product p=new Product();
			//m.addAttribute(product);
			m.addAttribute("productList",productDao.retrieveProduct());
			m.addAttribute("categoryList",this.getCategories());
			m.addAttribute("supplierList", this.getSuppliers());
			
			return "Product";
		}
		
		public LinkedHashMap<Integer,String> getCategories()
		{
			List<Category> listCategories=categoryDao.retrieveCategory();
			LinkedHashMap<Integer,String> categoriesList=new LinkedHashMap<Integer,String>();
			
			for(Category category:listCategories)
			{
				categoriesList.put(category.getCatId(),category.getCatName());
			}
			
			return categoriesList;		
		}

		
			
		
		public LinkedHashMap<Integer,String> getSuppliers()
		{
			List<Supplier> listSuppliers=supplierDao.retrieveSupplier();
			LinkedHashMap<Integer,String> suppliersList=new LinkedHashMap<Integer,String>();
			
			for(Supplier supplier:listSuppliers)
			{
				suppliersList.put(supplier.getsupId(),supplier.getsupName());
			}
			
			return suppliersList;
		}

		
		@RequestMapping(value="InsertProduct",method = RequestMethod.POST)
		public String addItem(@ModelAttribute("product") Product p,@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IOException
		{
			System.out.println("add product");
			p.setImage(file.getBytes());
			System.out.println("set bytes");
			productDao.addProduct(p);
			System.out.println("Added product");
			return "redirect:/product";
			
		}
	
		
		
		
		@RequestMapping(value="updateProduct/{productId}",method=RequestMethod.GET)
		public String editProduct(@PathVariable("productId") int productId,RedirectAttributes attributes)
		{Product p = productDao.getProduct(productId);
		productDao.updateProduct(p);
			attributes.addFlashAttribute("product", this.productDao.getProduct(productId));
			return "redirect:/product";
		   }
		
		@RequestMapping(value="deleteProduct/{productId}",method=RequestMethod.GET)
		public String removeProduct(@PathVariable("productId") int productId,RedirectAttributes attributes)
		{
			Product p = productDao.getProduct(productId);
			productDao.deleteProduct(p);
			attributes.addFlashAttribute("DeleteMessage", "Product has been deleted Successfully");
			return "redirect:/product";
		   }


	}




















