package main.establishment;

/**
 * Represents a table
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class Table {
    int idTable;
    boolean booked;

    /**
     * Empty constructor
     */
    public Table() {
        this.idTable = 0;
        this.booked = false;
    }

    /**
     * Table class constructor based on the id
     *
     * @param idTable Represents the table's id number
     */
    public Table(int idTable) {
        this.idTable = 0;
        this.booked = false;
    }

    /**
     * Table class constructor
     *
     * @param idTable   Represents the table's id number
     * @param booked    Represents whether the table is booked or not
     */
    public Table(int idTable, boolean booked) {
        this.idTable = idTable;
        this.booked = booked;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    /**
     * Change the status of the table to booked
     */
    public void bookTable() {
        this.booked = true;
    }

    /**
     * Change the status of the table to unbooked
     */
    public void unbookTable() {
        this.booked = false;
    }

    public boolean tableStatus() {
        return this.booked;
    }
}
