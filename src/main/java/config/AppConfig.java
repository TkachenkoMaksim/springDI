package config;

import com.mtkachenko.EmployeeService;
import com.mtkachenko.ProjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "employeeService")
    public EmployeeService getEmployeeService(){
        return new EmployeeService();
    }

    @Bean(name = "projectService")
    public ProjectService getProgectService(){
        return new ProjectService();
    }
}
