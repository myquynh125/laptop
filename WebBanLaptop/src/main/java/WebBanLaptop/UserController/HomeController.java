package WebBanLaptop.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		
		mvshare.addObject("slides", _homService.GetDataSlide());
		mvshare.addObject("category", _homService.GetDataCategory());
		mvshare.addObject("products", _homService.GetDataProduct());
		mvshare.setViewName("user/product/product");
		return mvshare;
	}
	
}
