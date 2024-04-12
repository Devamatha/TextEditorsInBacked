package com.techpixe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Template")
public class Template {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long templateId;
	private String content;
	private int fontSize;
	private String fontFamily;
	private String fontStyle; // Enum for font style (e.g., BOLD, ITALIC, UNDERLINE)
	private String textAlignment; // Enum for text alignment (e.g., LEFT, CENTER, RIGHT, JUSTIFY)
	private String textColor; // String for text color (color code or name)
	private String backgroundColor; // String for background color (color code or name)
	private boolean bullets;
	private boolean numbering;
	private int indentation; // Nu€mber of spaces or tabs for indentation
	private String hyperlinks; // String (URL)
	private String images; // String (URL or file path)
	private boolean spellCheck;
	private String findReplace; // String for find and replace functionality
	private int wordCount;
	private boolean lineNumbers;
	private boolean fullscreenMode;
	private boolean autoSave;

}
