package com.app.service;

import com.app.model.Speaker;
import com.app.repository.ISpeakerRepository;
import com.app.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerService implements ISpeakerService {

    @Autowired
    ISpeakerRepository speakerRepository;

    public  SpeakerService(ISpeakerRepository speakerRepository){
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(ISpeakerRepository speakerRepository){
        this.speakerRepository = speakerRepository;
    }
}
