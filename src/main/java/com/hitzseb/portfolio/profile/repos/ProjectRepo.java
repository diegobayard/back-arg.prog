package com.hitzseb.portfolio.profile.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hitzseb.portfolio.profile.models.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
    
}