package WebBanLaptop.UserController;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import WebBanLaptop.Service.User.IHomeImplService;
@Controller
public class BaseController {
	@Autowired
	IHomeImplService _homService;
	public ModelAndView mvshare=new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		mvshare.addObject("menus", _homService.GetDataMenu());
		return mvshare;
	}
}
