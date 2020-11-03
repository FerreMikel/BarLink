package main.command;

/**
 * Represents a user (employee)
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */

public class User {
    String name;
    int idEmployee;
    String typeEmployee;

    /**
     * Empty constructor
     */
    public User() {
        this.name = "New employee";
        this.idEmployee = 0;
        this.typeEmployee = "Undefined type";
    }

    /**
     * User class constructor
     *
     * @param name          Represents the user's (employee's) name
     * @param idEmployee    Represents the user's (employee's) employee id
     * @param typeEmployee  Represents the user (employee) type
     */
    public User(String name, int idEmployee, String typeEmployee) {
        this.name = name;
        this.idEmployee = idEmployee;
        this.typeEmployee = typeEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}
