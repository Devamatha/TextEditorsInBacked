package com.techpixe.service;

import java.util.List;

import com.techpixe.entity.Template;

public interface TemplateService {
	Template saveText(Template template);

	Template getText(Long id);

	List<Template> getAllTexts();

}
