package com.skilltracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilltracker.entity.Skill;

@Repository
public interface SkillRepository  extends JpaRepository<Skill, Long>{

}
