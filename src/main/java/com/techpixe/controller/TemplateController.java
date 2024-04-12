package com.techpixe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techpixe.entity.Template;
import com.techpixe.service.TemplateService;

@RestController
@RequestMapping("/api/text")

public class TemplateController {
	@Autowired
	private TemplateService templateService;

	@PostMapping("/save")
	public Template saveText(@RequestBody Template template) {
		return templateService.saveText(template);
	}

	@GetMapping("/{id}")
	public Template getText(@PathVariable Long id) {
		return templateService.getText(id);
	}
	 @GetMapping("/getall")
	    public ResponseEntity<List<Template>> getAllTexts() {
	        List<Template> texts = templateService.getAllTexts();
	        return new ResponseEntity<>(texts, HttpStatus.OK);
	    }

}
