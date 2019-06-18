package com.ml.audiencereviewanalysis;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ml.audiencereviewanalysis.dao.UserReviewRepo;
import com.ml.audiencereviewanalysis.model.UserReview;

@Controller
public class UploadController {
	
	@Autowired
	UserReviewRepo reviewRepo;
	
	@RequestMapping()
	public ModelAndView uploadData() {
		ModelAndView mv = new ModelAndView("uploader");
		
		return mv;
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView showReview() {
		ModelAndView mv = new ModelAndView("dashboard");
		UserReview review = reviewRepo.findById(1).orElse(new UserReview());
		mv.addObject(review);
		return mv;
	}
	
	@RequestMapping("/addReview")
	public ModelAndView addReview(UserReview review) {
		ModelAndView mv = new ModelAndView("dashboard");
		reviewRepo.save(review);
		
		return mv;
	}


}
