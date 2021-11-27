package com.app.repository;

import com.app.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepository implements ISpeakerRepository {

    @Autowired
    public Calendar calInstace;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Vasim");
        speaker.setLastName("Hayat");
        speakers.add(speaker);

        System.out.println(calInstace.getTime());
        return speakers;
    }
}
