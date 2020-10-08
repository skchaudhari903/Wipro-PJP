package com.wipro.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultsController {
	@RequestMapping("/results")
	public ModelAndView showResults() {
		ModelAndView mv = new ModelAndView("results");
		ArrayList<String> mov = new ArrayList<>(Arrays.asList("The Dark Knight", "Shawshank Redemption", "Pulp Fiction",
				"The Godfather", "Casino", "Shutter Island", "Interstellar", "Avengers Endgame", "Forrest Gump", "Lion"));
		mv.addObject("mov", mov);
		return mv;
	}
}
