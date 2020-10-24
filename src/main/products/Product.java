package main.products;

/**
 * Represents a product to be served in the establishment
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class Product {

    int idProduct;
    String name;
    String img;
    float price;

    /**
     * Empty constructor
     */
    public Product() {
        this.idProduct = 0;
        this.name = "";
        this.img = "";
        this.price = 0;
    }

    /**
     * Product constructor
     *
     * @param idProduct int value to represent the product identifier
     * @param name      String value to represent product's name
     * @param img       String value to represent product's image's path
     * @param price     float value to represent product's price
     */
    public Product(int idProduct, String name, String img, float price) {
        this.idProduct = idProduct;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
