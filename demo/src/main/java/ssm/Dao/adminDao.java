package ssm.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ssm.Po.admin;



public interface adminDao {
	
	//查询信息
	public List<admin> selectAdmin();
	
	//添加信息
	public int insertAdmin();
	
	//删除信息
	public int deleteAdmin(@Param("id")Integer id); 
	
	//更新前�?�过id查询
	public admin selectAdminOne(@Param("id")Integer id);
	
	//更新信息
	public int updateAdmin(admin ad);

}
