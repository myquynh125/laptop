package WebBanLaptop.Service.User;

import org.springframework.stereotype.Service;

import WebBanLaptop.Dto.PaginateDto;
@Service
public class PaginateServiceImpl {
	public PaginateDto GetInfoPaginate(int totalData, int limit, int currentPage)
	{
		PaginateDto paginate = new PaginateDto();
		paginate.setLimit(limit);
		paginate.setTotalPage(setInfoTotalPage(totalData, limit));
		paginate.setCurrentPage(CheckcurrentPage(currentPage, paginate.getTotalPage()));
		int start=FindStart(paginate.getCurrentPage(), limit);
		paginate.setStart(start);
		int end=FindEnd(paginate.getStart(), limit, totalData);
		paginate.setEnd(end);
		return paginate;
	}

	private int FindEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int FindStart(int limit, int currentPage) {
		// TODO Auto-generated method stub
		return ((currentPage - 1) * limit) + 1;
	}

	private int setInfoTotalPage(int totalData, int limit) {
		// TODO Auto-generated method stub
		int totalPage=0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}
	
	private int CheckcurrentPage(int currentPage, int totalPage) {
		// TODO Auto-generated method stub
		if(currentPage<1) {
			return 1;
		}
		if(currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}
}
