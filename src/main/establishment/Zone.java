package main.establishment;

import java.util.ArrayList;

/**
 * Represents a Represents a zone
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class Zone {

    int idZone;
    ArrayList<Table> tables;

    /**
     * Empty constructor
     */
    public Zone() {
        this.idZone = 0;
        this.tables = null;
    }

    /**
     * Zone class constructor
     *
     * @param idZone
     * @param tables
     */
    public Zone(int idZone, ArrayList<Table> tables) {
        this.idZone = idZone;
        this.tables = tables;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    /**
     * Method to add a table to the zone
     *
     * @param table Table class object, the table to be added to the zone
     */
    public void addTable(Table table) {
        this.tables.add(table);
    }

    /**
     * Method to remove a table from the zone
     *
     * @param table Table class object, the table to be removed from the zone
     */
    public void removeTable(Table table) {
        this.tables.remove(table);
    }
}
