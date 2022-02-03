package tespapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;
import tespapp.SigurExAppApplication;
import tespapp.controllers.EmployeeHireLogger;
import tespapp.controllers.EmployeesMgr;

@Service
public class ThreadService {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private TaskExecutor taskExecutor;

    public void executeThread(){
        taskExecutor.execute(applicationContext.getBean(EmployeesMgr.class));
        taskExecutor.execute(applicationContext.getBean(EmployeeHireLogger.class));
    }
}
