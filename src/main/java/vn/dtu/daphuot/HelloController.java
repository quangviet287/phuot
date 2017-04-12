package vn.dtu.daphuot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.dtu.daphuot.dao.entity.DiaDiemChiTiet;
import vn.dtu.daphuot.dao.manager.DiadiemManager;
import vn.dtu.daphuot.dto.Search;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("search", new Search());
		System.out.println("Hello");
		return "main";
	}

	DiadiemManager diadiemManager = new DiadiemManager();
	@RequestMapping(value = "Information",method = RequestMethod.POST)
	public String Information(@ModelAttribute("search") Search search, ModelMap model) {
		List<DiaDiemChiTiet> searchResults= diadiemManager.searchDiaDiem(search.getContent());
		model.addAttribute("results", searchResults);
		return "main";
	}
}