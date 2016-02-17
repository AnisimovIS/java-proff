package education.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    private Long id;
    private String FirstName;
    private String LastName;
    private Set<Employee> manager;
    private Post post;


}
