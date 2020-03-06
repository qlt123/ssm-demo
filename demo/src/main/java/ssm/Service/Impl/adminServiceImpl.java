package ssm.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssm.Dao.adminDao;
import ssm.Po.admin;
import ssm.Service.adminService;

@Service("adminService")
@Transactional
public class adminServiceImpl implements adminService{
	
	@Autowired
	private adminDao adminDao;
	
	@Override
	public List<admin> selectAdmin(){
		return adminDao.selectAdmin();
	}
	
	//添加信息
	public int insertAdmin(admin ad){
			return adminDao.insertAdmin();
	}
	
	//删除信息
	public int deleteAdmin(Integer id) {
		return adminDao.deleteAdmin(id);
	}
	
	//更新前�?�过id查询
	@Override
	public admin selectAdminOne(Integer id) {
		return adminDao.selectAdminOne(id);
	}
	//更新管理员信�?
	@Override
	public int updateAdmin(admin ad) {
		return adminDao.updateAdmin(ad);
	}

}
