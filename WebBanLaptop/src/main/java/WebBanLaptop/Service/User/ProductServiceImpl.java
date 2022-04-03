package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import WebBanLaptop.DAO.ProductsDao;
import WebBanLaptop.Dto.ProductsDto;

public class ProductServiceImpl implements IProductsService {
	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public List<ProductsDto> GetProductById(int id) {
		return productDao.GetProductByid(id);
	}



	
	

}
