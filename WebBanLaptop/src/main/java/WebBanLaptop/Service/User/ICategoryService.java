package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import WebBanLaptop.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductByid(int id);
	
	public List<ProductsDto> GetDataProductPaginate(int id, int start, int totalPage);
}
