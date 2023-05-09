package com.example.db_setup;

import com.example.db_setup.persistence.ActivityRepository;
import com.example.db_setup.persistence.activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    ActivityRepository activityRepository;

    @Autowired
    public Controller(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @GetMapping("/activity")
    public String getUserByName(@RequestParam String nome){

        activity activityUser = activityRepository.findByName(nome);

        return activityUser.toString();
    }
}
