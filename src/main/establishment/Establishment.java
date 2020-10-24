package main.establishment;

/**
 * Represents an establishment
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */

public class Establishment {

    String name;
    String address;
    int phone;
    String nif;
    String email;

    /**
     * Empty constructor
     */
    public Establishment() {
        this.name = "";
        this.address = "";
        this.phone = 000000000;
        this.nif = "";
        this.email = "";
    }

    /**
     * Establishment class constructor
     *
     * @param name      String Name of the establishment
     * @param address   String address of the establishment
     * @param phone     int telephone number of the establishment
     * @param nif       String NIF of the establishment
     * @param email     String e-mail of the establishment
     */
    public Establishment(String name, String address, int phone, String nif, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nif = nif;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
