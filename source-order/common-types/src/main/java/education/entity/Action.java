package education.entity;

import javax.persistence.*;

@Entity
@Table(name = "ACTION")
public class Action{
    @Id
    @Column(name = "ACTION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "action_gen")
    @SequenceGenerator(name = "action_gen",sequenceName = "action_id_gen")
    private Long id;

    @Column(name = "ENERGY")
    private Long energy;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(cascade = {CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTION_TYPE_ID")
    private ActionType type;

    public Long getId() {
        return id;
    }

    public Long getEnergy() {
        return energy;
    }

    public void setEnergy(Long energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }
}
