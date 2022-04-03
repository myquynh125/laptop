package WebBanLaptop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import WebBanLaptop.Dto.ProductsDto;

@Service
public interface IProductsService {
	public List<ProductsDto> GetProductById(int id);

}
