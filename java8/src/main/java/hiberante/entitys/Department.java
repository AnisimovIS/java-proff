package hiberante.entitys;

import java.util.Set;

public class Department {
    private Long id;
    private String name;
    private Employee manager;
    private Set<Appointment> appointments;
    private Department parentDepartment;
    public Department() {
    }
}
