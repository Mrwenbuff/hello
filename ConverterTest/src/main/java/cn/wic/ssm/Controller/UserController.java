package cn.wic.ssm.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.wic.ssm.User;

@Controller
public class UserController {
	private static final Log LOG = LogFactory.getLog(UserController.class);
	@RequestMapping(value="/{formname}" )
	public String loginForm(@PathVariable String formname) {
		return formname;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute User user,Model model) {
		LOG.info(user);
		model.addAttribute("user", user);
		return "success";
	}
}
