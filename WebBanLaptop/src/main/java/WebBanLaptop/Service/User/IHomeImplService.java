package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebBanLaptop.DAO.CategoryDao;
import WebBanLaptop.DAO.MenuDao;
import WebBanLaptop.DAO.ProductsDao;
import WebBanLaptop.DAO.SlideDao;
import WebBanLaptop.Dto.ProductsDto;
import WebBanLaptop.Entity.Category;
import WebBanLaptop.Entity.Menu;
import WebBanLaptop.Entity.Slides;
@Service
public class IHomeImplService implements IHomeService{
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private SlideDao slideDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productDao;
	public List<Slides> GetDataSlide() {
		return slideDao.GetDataSlide();
	}
	public List<Category> GetDataCategory() {
		return categoryDao.GetDataCategory();
	}
	public List<Menu> GetDataMenu() {
		return menuDao.GetDataMenu();
	}
	public List<ProductsDto> GetDataProduct(){
		List<ProductsDto> listproduct=productDao.GetDataProduct();
		return listproduct;
	}
}
