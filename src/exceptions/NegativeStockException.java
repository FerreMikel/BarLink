package exceptions;

/**
 * Represents an exception to be thrown whenever the stock of a product
 * reaches a negative amount.
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */

public class NegativeStockException extends Exception {
    public NegativeStockException(int stock) {
        super("The amount consumed is higher than the stock available. " + stock + " items are left.");
    }
}
