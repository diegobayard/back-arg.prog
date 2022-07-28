package com.argProg.portfolio.profile.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
	@JsonView(Views.Public.class)
	@Id
	private Long id;
	private String banner;
	@JsonView(Views.Public.class)
	private String avatar;
	@JsonView(Views.Public.class)
	private String fullName;
	private String title;
	private String contact;
	private String domicile;
	private String about;
	@JsonManagedReference
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Experience> experiences;
	@JsonManagedReference
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Study> studies;
	@JsonManagedReference
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Skill> skills;
	@JsonManagedReference
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Project> projects;

	public Person() {
	}

	public Person(Long id, String banner, String avatar, String fullName, String title, String contact, String domicile,
			String about, List<Experience> experiences, List<Study> studies, List<Skill> skills,
			List<Project> projects) {
		this.id = id;
		this.banner = banner;
		this.avatar = avatar;
		this.fullName = fullName;
		this.title = title;
		this.contact = contact;
		this.domicile = domicile;
		this.about = about;
		this.experiences = experiences;
		this.studies = studies;
		this.skills = skills;
		this.projects = projects;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public List<Study> getStudies() {
		return studies;
	}

	public void setStudies(List<Study> studies) {
		this.studies = studies;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}