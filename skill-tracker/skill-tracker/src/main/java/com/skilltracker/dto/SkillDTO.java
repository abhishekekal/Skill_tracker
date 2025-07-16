package com.skilltracker.dto;



import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SkillDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String domain;

    @Min(1)
    @Max(10)
    private int level;
    @Email
    @NotBlank
    private String mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getmail() {
		return mail;
	}
	public void setmail(String mail) {
		this.mail = mail;
	}
    
    

    // Getters and Setters
}

