package WebBanLaptop.UserController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController extends BaseController{
	@RequestMapping(value = {"//{id}"})
	public ModelAndView Index(@PathVariable long id) {
		mvshare.setViewName("user/products/product");
		return mvshare;
	}

}
