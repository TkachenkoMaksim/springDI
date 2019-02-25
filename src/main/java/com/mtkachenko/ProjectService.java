package com.mtkachenko;

import org.springframework.beans.factory.annotation.Autowired;

public class ProjectService {
    @Autowired
    private EmployeeService emplServ;

    public EmployeeService getEmplServ() {
        return emplServ;
    }
}
