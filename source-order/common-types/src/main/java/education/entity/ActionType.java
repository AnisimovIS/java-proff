package education.entity;
import javax.persistence.*;
@Entity
@Table(name = "ACTION_TYPE")
public class ActionType {
    @Id
    @Column(name = "ACTION_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "action_type_gen")
    @SequenceGenerator(name = "action_gen",sequenceName = "action_type_id_gen")
    private long id;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
