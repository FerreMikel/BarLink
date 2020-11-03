package main.command;

import main.products.Product;

import java.util.Date;
import java.util.ArrayList;

/**
 * Represents a command
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */

public class Command {
    int idCommand;
    ArrayList<Product> products;
    long timestamp;
    float totalAmount;
    int idTable;
    int idEmployee;
    boolean billed;

    /**
     * Empty constructor
     */
    public Command() {
        this.idCommand=0;
        this.products = new ArrayList<>();
        this.timestamp = new Date().getTime();
        this.totalAmount = 0;
        this.idTable = 0;
        this.idEmployee = 0;
        this.billed = false;
    }

    /**
     * Command class constructor
     *
     * @param idCommand     Represents the command's id number
     * @param products      Represents the group of products included in the command
     * @param totalAmount   Represents the total amount of the command
     * @param idTable       Represents the table's id number
     * @param idEmployee    Represents the employee's id number
     * @param billed        Represents whether the table is billed or not
     */
    public Command(int idCommand, ArrayList<Product> products, float totalAmount, int idTable, int idEmployee, boolean billed) {
        this.idCommand = idCommand;
        this.products = products;
        this.timestamp = new Date().getTime();
        this.totalAmount = totalAmount;
        this.idTable = idTable;
        this.idEmployee = idEmployee;
        this.billed = billed;
    }

    public int getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(int idCommand) {
        this.idCommand = idCommand;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public boolean isBilled() {
        return billed;
    }

    public void setBilled(boolean billed) {
        this.billed = billed;
    }

    /**
     * Sets the state of the command as billed
     * @return The series of products included in the command
     */
    public ArrayList<Product> bill() {
        this.billed = true;
        return this.products;
    }
}
