package education.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "POST")
public class Post {
    private Long id;
    private String name;
    private Set<Department> departments;

}
