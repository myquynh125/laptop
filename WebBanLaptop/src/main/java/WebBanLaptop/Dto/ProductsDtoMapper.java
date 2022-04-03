package WebBanLaptop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import WebBanLaptop.Entity.Menu;

public class ProductsDtoMapper implements RowMapper<ProductsDto>{

	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto productsDto=new ProductsDto();
		productsDto.setId_product(rs.getLong("id_product"));
		productsDto.setId_category(rs.getInt("id_category"));
		productsDto.setName(rs.getString("name"));
		productsDto.setPrice(rs.getDouble("price"));
		productsDto.setSale(rs.getInt("sale"));
		productsDto.setTittle(rs.getString("tittle"));
		productsDto.setNew_product(rs.getBoolean("new_product"));
		productsDto.setDescription(rs.getString("description"));
		productsDto.setId_color(rs.getLong("id_color"));
		productsDto.setName_color(rs.getString("name_color"));
		productsDto.setCode_color(rs.getString("code_color"));
		productsDto.setImg_color(rs.getString("img_color"));
		productsDto.setCreate_at(rs.getDate("create_at"));
		productsDto.setUpdate_at(rs.getDate("update_at"));
		return productsDto;
		
	}

}
