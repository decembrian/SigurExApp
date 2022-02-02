package tespapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tespapp.services.ThreadService;

@Component
public class ThreadAppRunner implements ApplicationRunner {

    @Autowired
    ThreadService threadService;

    @Override
    public void run(ApplicationArguments args){
        threadService.executeThread();
    }
}
