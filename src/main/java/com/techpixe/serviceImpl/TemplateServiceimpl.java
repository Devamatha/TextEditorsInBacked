package com.techpixe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techpixe.entity.Template;
import com.techpixe.repository.TemplateRepository;
import com.techpixe.service.TemplateService;

@Service
public class TemplateServiceimpl implements TemplateService {
	@Autowired
	private TemplateRepository templateRepository;

	@Override
	public Template saveText(Template template) {

		return templateRepository.save(template);
	}

	@Override
	public Template getText(Long id) {

		return templateRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tempplate with Id " + id + "is not present"));
	}

	 @Override
	    public List<Template> getAllTexts() {
	        return templateRepository.findAll();
	    }
}
