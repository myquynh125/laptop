package WebBanLaptop.Service.User;

import org.springframework.stereotype.Service;

import WebBanLaptop.Dto.PaginateDto;

@Service
public interface IPaginateService {
	public PaginateDto GetInfoPaginate(int totalPage, int limit, int currentPage); 
}
