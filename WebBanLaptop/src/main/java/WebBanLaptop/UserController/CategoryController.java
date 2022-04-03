package WebBanLaptop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import WebBanLaptop.Dto.PaginateDto;
import WebBanLaptop.Service.User.CategoryServiceImpl;
import WebBanLaptop.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController{
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PaginateServiceImpl paginateService;
	private int totalProductPage = 9 ;
	
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {
		mvshare.setViewName("user/product/category");
		int totalData=categoryService.GetAllProductByid(Integer.parseInt(id)).size();
		PaginateDto paginateDto = paginateService.GetInfoPaginate(totalData, totalProductPage, 1);
		mvshare.addObject("idCategory", id);
		mvshare.addObject("paginateInfo", paginateDto);
		mvshare.addObject("ProductPaginate", categoryService.GetDataProductPaginate(Integer.parseInt(id),paginateDto.getStart(),totalProductPage));
		return mvshare;
	}
	
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id ,@PathVariable String currentPage) {
		int totalProductPage=9;
		mvshare.setViewName("user/product/category");
		int totalData=categoryService.GetAllProductByid(Integer.parseInt(id)).size();
		PaginateDto paginateDto = paginateService.GetInfoPaginate(totalData, totalProductPage,Integer.parseInt(currentPage) );
		mvshare.addObject("idCategory", id);
		mvshare.addObject("paginateInfo", paginateDto);
		mvshare.addObject("ProductPaginate", categoryService.GetDataProductPaginate(Integer.parseInt(id),paginateDto.getStart(),totalProductPage));
		return mvshare;
	}
}
