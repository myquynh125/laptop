package WebBanLaptop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebBanLaptop.Entity.MapperSlides;
import WebBanLaptop.Entity.Slides;

@Repository
public class SlideDao extends BaseDao{

	public List<Slides> GetDataSlide(){
		List<Slides> list=new ArrayList<Slides>();
		String sql="SELECT * FROM slides";
		list = jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
