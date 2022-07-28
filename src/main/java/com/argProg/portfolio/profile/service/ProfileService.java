package com.argProg.portfolio.profile.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.profile.models.Experience;
import com.argProg.portfolio.profile.models.Person;
import com.argProg.portfolio.profile.models.Project;
import com.argProg.portfolio.profile.models.Skill;
import com.argProg.portfolio.profile.models.Study;
import com.argProg.portfolio.profile.repos.ExperienceRepo;
import com.argProg.portfolio.profile.repos.PersonRepo;
import com.argProg.portfolio.profile.repos.ProjectRepo;
import com.argProg.portfolio.profile.repos.SkillRepo;
import com.argProg.portfolio.profile.repos.StudyRepo;

@Service
public class ProfileService {

	private final PersonRepo personRepo;
	private final ExperienceRepo experienceRepo;
	private final SkillRepo skillRepo;
	private final StudyRepo studyRepo;
	private final ProjectRepo projectRepo;
	
	
	
	public ProfileService(PersonRepo personRepo, ExperienceRepo experienceRepo,
			SkillRepo skillRepo, StudyRepo studyRepo, ProjectRepo projectRepo) {
		this.personRepo = personRepo;
		this.experienceRepo = experienceRepo;
		this.skillRepo = skillRepo;
		this.studyRepo = studyRepo;
		this.projectRepo = projectRepo;
	}

	// PERSON
	
	public List<Person> findPersons() {
		return personRepo.findAll();
	}

	public Person findPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}

	public void savePerson(Person person) {
		personRepo.save(person);
	}
	
	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}

	// EXPERIENCE

	public Experience findExperience(Long id) {
		return experienceRepo.findById(id).orElse(null);
	}

	public void saveExperience(Experience experience) {
		experienceRepo.save(experience);
	}

	public void deleteExperience(Long id) {
		experienceRepo.deleteById(id);
	}
	
	// SKILL
	
	public Skill findSkill(Long id) {
		return skillRepo.findById(id).orElse(null);
	}
	
	public void saveSkill(Skill skill) {
		skillRepo.save(skill);
	}
	
	public void deleteSkill(Long id) {
		skillRepo.deleteById(id);
	}

	// STUDY

	public Study findStudy(Long id) {
		return studyRepo.findById(id).orElse(null);
	}

	public void saveStudy(Study study) {
		studyRepo.save(study);
	}

	public void deleteStudy(Long id) {
		studyRepo.deleteById(id);
	}

	// PROJECT

	public Project findProject(Long id) {
		return projectRepo.findById(id).orElse(null);
	}

	public void saveProject(Project project) {
		projectRepo.save(project);
	}

	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}

}
