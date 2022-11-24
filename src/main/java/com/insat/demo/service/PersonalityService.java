package com.insat.demo.service;

import com.insat.demo.entity.Personality;
import com.insat.demo.repositories.PersonalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalityService{
    @Autowired
    PersonalityRepository personalityRepository;

    public Personality createPersonality(Personality personality) {

        Personality createdPersonality = this.personalityRepository.save(personality);
        return createdPersonality;
    }

    public List<Personality> getAllPersonalities() {

        List<Personality> personalities = this.personalityRepository.findAll();
        return personalities;
    }

}
