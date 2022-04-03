package WebBanLaptop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebBanLaptop.Entity.MapperMenu;
import WebBanLaptop.Entity.Menu;
@Repository
public class MenuDao extends BaseDao{
	public List<Menu> GetDataMenu(){
		List<Menu> menu=new ArrayList<Menu>();
		String sql="SELECT * FROM menus";
		menu = jdbcTemplate.query(sql, new MapperMenu());
		return menu;
	}
}
