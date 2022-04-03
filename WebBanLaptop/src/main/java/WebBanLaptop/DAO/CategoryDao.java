package WebBanLaptop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebBanLaptop.Entity.Category;
import WebBanLaptop.Entity.MapperCategory;

@Repository
public class CategoryDao extends BaseDao{
	
	public List<Category> GetDataCategory(){
		List<Category> list=new ArrayList<Category>();
		String sql="SELECT * FROM category";
		list = jdbcTemplate.query(sql, new MapperCategory());
		return list;
	}
}
