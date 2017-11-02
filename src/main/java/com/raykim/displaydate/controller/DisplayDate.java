package com.raykim.displaydate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class DisplayDate {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date d = new Date();
		SimpleDateFormat dFormat = new SimpleDateFormat("EEEEEEE, 'the' dd 'of' MMMMMMMM, yyyy");
		String date = dFormat.format(d);
		model.addAttribute("date", date);
		return "date";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date t = new Date();
		SimpleDateFormat tFormat = new SimpleDateFormat("h:mm a");
		String time = tFormat.format(t);
		model.addAttribute("time", time);
		return "time";
	}
}
