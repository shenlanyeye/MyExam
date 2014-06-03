package com.thinkgem.jeesite.modules.exam.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.sys.entity.Area;


@Controller
@RequestMapping(value = "${frontPath}/exam/front/judge")
public class FrontJudgeController extends BaseController {

	
	@RequestMapping(value = "index")
	public String index(Area area, Model model) {
		
		
		return "modules/exam/front/index";
	}
}
