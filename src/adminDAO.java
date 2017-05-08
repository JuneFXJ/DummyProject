import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import Admin;

public class adminDAO implements adminDAOImp {
private JdbcTemplate jdbcTemplate;
	
private static final class AdminMapper implements RowMapper{
	

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAccount(rs.getString("account"));
		admin.setPassword(rs.getString("password"));
		return admin;
	}
}


	/*
	 * ≤È—Ø–≈œ¢
	 * (non-Javadoc)
	 * @see UserDAOInterface#select(int)
	 */

	public Admin select(String account,String password){
		// TODO Auto-generated method stub
		String sql="select * from admin where account=? and password=?";
		try{
			RowMapper rowMapper=new BeanPropertyRowMapper(Admin.class);
			return jdbcTemplate.queryForObject(sql,rowMapper,account,password);
		}catch(Exception e){
			return null;
		}
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
