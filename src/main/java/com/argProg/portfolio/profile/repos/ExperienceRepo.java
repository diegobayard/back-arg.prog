package com.argProg.portfolio.profile.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argProg.portfolio.profile.models.Experience;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Long> {
	
}