package education.entity;

import javax.persistence.*;

@Entity
@Table(name="PEOPLE")
public class People  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "people_name")
    private String name;

    public People(String name) {
        this.name = name;
    }

    public People() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
