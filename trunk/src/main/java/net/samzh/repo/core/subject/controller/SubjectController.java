package net.samzh.repo.core.subject.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.samzh.repo.core.subject.service.SubjectService;
import net.samzh.repo.core.subject.vo.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@RequestMapping("save")
	public ModelAndView doSave(Subject subject, HttpServletRequest request, ModelMap map) {
		Date date = new Date();
		subject.setCreated(date);
		subject.setUpdated(date);
		try {
			subjectService.persist(subject);	
		} catch(Exception e) {
			e.printStackTrace();
			map.put("errorMsg", e.getMessage());
			return new ModelAndView("/common/error", map);
		}
		

		return new ModelAndView("redirect:/subject/list");
	}

	@RequestMapping("list/{offset}")
	public ModelAndView doList(ModelMap map, @PathVariable int offset) {
		List<Subject> list = subjectService.listAll();
		map.put("subjectList", list);
		return new ModelAndView("/subject/list", map);
	}

	@RequestMapping("list")
	public ModelAndView doListAll(ModelMap map) {
		List<Subject> list = subjectService.listAll();
		map.put("subjectList", list);
		return new ModelAndView("/subject/list", map);
	}

	@RequestMapping("new")
	public ModelAndView doNew(ModelMap map) {
		map.put("subject", new Subject());
		return new ModelAndView("/subject/content", map);
	}

	@RequestMapping("delete/{id}")
	public ModelAndView doDelete(@PathVariable long id, ModelMap map) {
		try {
			subjectService.removeById(id);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("errorMsg", e.getMessage());
			return new ModelAndView("/subject/list", map);
		}
		return new ModelAndView("/subject/list");
	}

}
