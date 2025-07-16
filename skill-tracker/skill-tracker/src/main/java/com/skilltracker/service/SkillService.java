package com.skilltracker.service;



import com.skilltracker.dto.SkillDTO;
import com.skilltracker.entity.Skill;
import com.skilltracker.exception.ResourceNotFoundException;
import com.skilltracker.repository.SkillRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repo;

    public Skill create(SkillDTO dto) {
        Skill skill = new Skill();
        BeanUtils.copyProperties(dto, skill);
        return repo.save(skill);
    }

    public List<Skill> getAll() {
        return repo.findAll();
    }

    public Skill update(Long id, SkillDTO dto) {
        Skill skill = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skill not found with id " + id));
        BeanUtils.copyProperties(dto, skill);
        return repo.save(skill);
    }

    public void delete(Long id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Skill not found with id " + id);
        repo.deleteById(id);
    }
}

