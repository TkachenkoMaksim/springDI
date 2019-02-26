import com.mtkachenko.EmployeeInput;
import com.mtkachenko.ProjectService;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        EmployeeInput employeeInput = (EmployeeInput) context.getBean("employeeService");
        System.out.println(employeeInput.getAll());

        ProjectService projectService = (ProjectService) context.getBean("projectService");
        System.out.println(projectService.getEmplServ().getAll());
    }
}

