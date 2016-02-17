package hiberante.entitys;

import java.util.Set;

/**
 * Created by Ilya on 17.02.2016.
 */
public class Employee {
    private Long id;
    private String FirstName;
    private String LastName;
    private Set<Employee> manager;
    private Appointment appointment;

    public Employee() {
    }

}
