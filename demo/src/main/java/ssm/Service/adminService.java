package ssm.Service;

import java.util.List;

import ssm.Po.admin;

public interface adminService {
	
	//鏌ヨ淇℃伅
	public List<admin> selectAdmin();	
	//娣诲姞淇℃伅
	public int insertAdmin(admin ad);
	//鍒犻櫎淇℃伅
	public int deleteAdmin(Integer id);
	//鏇存柊鍓嶉�氳繃id鏌ヨ�?
	public admin selectAdminOne(Integer id);
	//鏇存柊淇℃伅
	public int updateAdmin(admin ad);

}
