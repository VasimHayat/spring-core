package com.app.repository;

import com.app.model.Speaker;
import java.util.List;

public interface ISpeakerRepository {
    public List<Speaker> findAll();
}
