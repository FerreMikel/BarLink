package main.products;

/**
 * Represents an inventory product, extends product
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class StockProduct extends Product {
    int amount;

    /**
     * Empty constructor
     */
    public StockProduct() {
        super();
        this.amount = 0;
    }

    /**
     * Inventory product constructor,calls superclass constructor and sets numeric value to 0
     *
     * @param idProduct int value to represent the product identifier
     * @param name      String value to represent product's name
     * @param img       String value to represent product's image's path
     * @param price     float value to represent product's price
     */
    public StockProduct(int idProduct, String name, String img, float price) {
        super(idProduct, name, img, price);
        this.amount = 0;
    }

    /**
     * Inventory product constructor, calls superclass constructor and initializes price variable
     *
     * @param idProduct int value to represent the product identifier
     * @param name      String value to represent product's name
     * @param img       String value to represent product's image's path
     * @param price     float value to represent product's price
     * @param amount    int value to represent the quantity of said product in the inventary
     */
    public StockProduct(int idProduct, String name, String img, float price, int amount) {
        super(idProduct, name, img, price);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Adds stock to inventory
     *
     * @param amount quantity of stock added
     */
    public void addStock(int amount) {
        this.amount += amount;
    }

    /**
     * Consumes stock
     *
     * @param amount quantity consumed
     */
    public void consume(int amount) {
        this.amount -= amount;
    }
}
