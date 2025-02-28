package org.telran.ede.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.ede.repository.MonitorRepository;

@Service
public class MonitorServiceImpl implements MonitorService{

    private MonitorRepository repository;

    //3) Setter injection
    @Autowired
    public void setRepository(MonitorRepository repository) {
        this.repository = repository;
    }

    @Override
    public void increase() {

    }
}
