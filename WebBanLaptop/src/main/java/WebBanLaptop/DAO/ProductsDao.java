package WebBanLaptop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebBanLaptop.Dto.ProductsDto;
import WebBanLaptop.Dto.ProductsDtoMapper;
import WebBanLaptop.Entity.MapperMenu;
import WebBanLaptop.Entity.Menu;
@Repository
public class ProductsDao extends BaseDao{
	
	private StringBuffer sqlString() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_category ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.tittle ");
		sql.append(", p.new_product ");
		sql.append(", p.description ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.img as img_color ");
		sql.append(", p.create_at ");
		sql.append(", p.update_at ");
		sql.append("FROM ");
		sql.append("products AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id=c.id_product ");
	
		return sql;
	}
	
	private String sqlProducts(boolean NewProduct) {
		StringBuffer sql= sqlString();
		if(NewProduct) {
			sql.append("WHERE p.new_product = true ");
		}
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("ORDER BY RAND() ");
		if(NewProduct) {
			sql.append("LIMIT 12 ");
		}
		return sql.toString();
	}
	
	private StringBuffer sqlProductsById(int id) {
		StringBuffer sql= sqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_category = " + id + " ");
		return sql;
	}
	
	private String sqlProductsPaginate(int id,int start, int totalPage) {
		StringBuffer sql= sqlProductsById(id);
		sql.append("LIMIT " + start + "," + totalPage);
		return sql.toString();
	}
	
	public List<ProductsDto> GetDataProduct(){
		List<ProductsDto> product=new ArrayList<ProductsDto>();
		String sql= sqlProducts(true);
		product = jdbcTemplate.query(sql, new ProductsDtoMapper());
		return product;
	}
	
	public List<ProductsDto> GetAllProductByid(int id){
		List<ProductsDto> product=new ArrayList<ProductsDto>();
		String sql= sqlProductsById(id).toString();
		product = jdbcTemplate.query(sql, new ProductsDtoMapper());
		return product;
	}
	
	public List<ProductsDto> GetDataProductPaginate(int id,int start, int totalPage){
		List<ProductsDto> product=new ArrayList<ProductsDto>();
		String sql= sqlProductsPaginate(id,start, totalPage);
		product = jdbcTemplate.query(sql, new ProductsDtoMapper());
		return product;
	}
	
	private String sqlProductById(int id) {
		StringBuffer sql= sqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		sql.append("LIMIT 1");
		return sql.toString();
	}

	public List<ProductsDto> GetProductByid(int id) {
		String sql  = sqlProductById(id);
		List<ProductsDto> product = jdbcTemplate.query(sql, new ProductsDtoMapper());
		return product;
	}
}
