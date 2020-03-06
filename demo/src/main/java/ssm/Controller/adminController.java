package ssm.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ssm.Po.admin;
import ssm.Service.adminService;

//控制器

@Controller
@RequestMapping("/admin")
public class adminController {
	@Autowired
	private adminService adminService;
	
	@RequestMapping(value="/select.action")
	public String selectAdmin(Model model,HttpServletRequest request) {
		List<admin> list = adminService.selectAdmin();
		model.addAttribute("admin", list);
		return "data";
	}
	//添加信息
	@RequestMapping(value="/insert.action",method= RequestMethod.POST)
	public String  insert(Model model,@RequestParam("name")String  name,@RequestParam("psw") String psw) {
		admin ad=new admin();
		ad.setName(name);
		ad.setPsw(psw);
		if(adminService.insertAdmin(ad)>0)
		{
			model.addAttribute("msg", "添加成功");
			return "redirect:data";
		}else {
			model.addAttribute("msg", "添加成功");
			return "index";
		}
	}

}
