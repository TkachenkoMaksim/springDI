package com.mtkachenko;

public class EmployeeService implements EmployeeInput{
    public String getAll() {
        String[] employee = new String[]{name1St, name2St, name3St, name4St, name5St, name6St, name7St, name8St};
        String st1 = "";
        for (String st2 : employee) {
            st1 += st2 + "\n";
        }
        return st1;
    }
}
