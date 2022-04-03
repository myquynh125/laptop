package WebBanLaptop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategory implements RowMapper<Category>{
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException{
		Category cate=new Category();
		cate.setId(rs.getInt("id"));
		cate.setName(rs.getString("name"));
		cate.setDescription(rs.getString("description"));
		return cate;
	}
}
