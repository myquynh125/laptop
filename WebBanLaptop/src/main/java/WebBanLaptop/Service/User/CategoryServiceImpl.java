package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebBanLaptop.DAO.ProductsDao;
import WebBanLaptop.Dto.ProductsDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ProductsDao productsDao;
	
	public List<ProductsDto> GetAllProductByid(int id){
		return productsDao.GetAllProductByid(id);
	}

	public List<ProductsDto> GetDataProductPaginate(int id, int start, int totalPage) {
		// TODO Auto-generated method stub
		return productsDao.GetDataProductPaginate(id, start, totalPage);
	}
		
	
}
