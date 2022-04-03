package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebBanLaptop.DAO.SlideDao;
import WebBanLaptop.Dto.ProductsDto;
import WebBanLaptop.Entity.Category;
import WebBanLaptop.Entity.Menu;
import WebBanLaptop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	@Autowired
	public List<Category> GetDataCategory();
	@Autowired
	public List<Menu> GetDataMenu();
	public List<ProductsDto> GetDataProduct();
}
