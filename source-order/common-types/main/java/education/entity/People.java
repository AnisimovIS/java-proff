package education.entity;

import javax.persistence.*;

@Entity
@Table(name="People")
public class People  {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
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
