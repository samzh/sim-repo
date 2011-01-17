package net.samzh.repo.core.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户相关操作
 * 
 * @author Sam Zheng
 * 
 */
@Controller(value = "user")
@RequestMapping("/user")
public class UserController {

	@RequestMapping("hello")
	public ModelAndView index(ModelMap map, HttpServletRequest request) {
		String name = request.getParameter("inputName");
		if (StringUtils.isBlank(name)) {
//			map.put("command", "");
			return new ModelAndView("/user/input", map);
		} else {
			map.put("inputName", name);
		}
		return new ModelAndView("/user/show", map);
	}
}
