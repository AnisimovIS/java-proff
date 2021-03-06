package education.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Employee manager;
    private Set<Post> appointments;
    private Department parentDepartment;
    public Department() {
    }
}
