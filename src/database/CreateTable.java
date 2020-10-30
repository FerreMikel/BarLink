package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Class to create tables in the database
 *
 * @author sqlitetutorial.net
 * @author github.com/jonleinena
 * @author github.com/FerreMikel
 */
public class CreateTable {

    /**
     * Method to create a new table in the BarLink database.
     */
    public static void createNewTable() {
        String db = "BarLink.db";
        String url = "jdbc:sqlite:" + db;


        String sql1 = "CREATE TABLE IF NOT EXISTS ZONE (\n"
                + "    idZone integer NOT NULL,\n"
                + "    name text NOT NULL,\n"
                + "    capacity real NOT NULL\n"
                + ");";

        String sql2 = "CREATE TABLE IF NOT EXISTS TABLE_DB (\n"
                + "    idTable integer NOT NULL,\n"
                + "    idZone integer NOT NULL,\n"
                + "    tableCapacity real NOT NULL, \n"
                + "    FOREIGN KEY(idZone) REFERENCES ZONE(idZone),\n"
                + "    PRIMARY KEY(idTable, idZone)\n"
                + ");";

        String sql3 = "CREATE TABLE IF NOT EXISTS USER (\n"
                + "    idUser integer NOT NULL PRIMARY KEY,\n"
                + "    name text NOT NULL,\n"
                + "    type text NOT NULL\n"
                + ");";

        String sql4 = "CREATE TABLE IF NOT EXISTS PRODUCT_CATEGORY (\n"
                + "    idCategory integer PRIMARY KEY,\n"
                + "    name text NOT NULL\n"
                + ");";

        String sql5 = "CREATE TABLE IF NOT EXISTS MENU_PRODUCT (\n"
                + "    idProduct integer,\n"
                + "    idCategory integer NOT NULL,\n"
                + "    idCommand integer NOT NULL,\n"
                + "    name text NOT NULL,\n"
                + "    price real NOT NULL,\n"
                + "    description ingredients NOT NULL,\n"
                + "    imagePath text NOT NULL,\n"
                + "    FOREIGN KEY(idCategory) REFERENCES PRODUCT_CATEGORY(idCategory),\n"
                + "    FOREIGN KEY(idCommand) REFERENCES COMMAND(idCommand),\n"
                + "    PRIMARY KEY(idProduct, idCategory)\n"
                + ");";
        String sql6 = "CREATE TABLE IF NOT EXISTS COMMAND (\n"
                + "    idCommand integer NOT NULL,\n"
                + "    idTable integer NOT NULL,\n"
                + "    idProduct integer NOT NULL,\n"
                + "    idUser integer NOT NULL,\n"
                + "    hour DATETIME NOT NULL,\n"
                + "    FOREIGN KEY(idTable) REFERENCES TABLE_DB(idTable),\n"
                + "    FOREIGN KEY(idProduct) REFERENCES PRODUCT(idProduct),\n"
                + "    FOREIGN KEY(idUser) REFERENCES USER(idUser),\n"
                + "    PRIMARY KEY(idCommand, idTable, idProduct, idUser)\n"
                + ");";
        String sql7 = "CREATE TABLE IF NOT EXISTS RECEIPT (\n"
                + "    idReceipt integer NOT NULL,\n"
                + "    idCommand integer NOT NULL,\n"
                + "    hour DATETIME NOT NULL,\n"
                + "    price real,\n"
                + "    FOREIGN KEY(idCommand) REFERENCES COMMAND(idCommand),\n"
                + "    PRIMARY KEY(idReceipt, idCommand)\n"
                + ");";
        String sql8 = "CREATE TABLE IF NOT EXISTS WAREHOUSE_CATEGORY (\n"
                + "    idWCategory integer NOT NULL PRIMARY KEY,\n"
                + "    name text NOT NULL\n"
                + ");";
        String sql9 = "CREATE TABLE IF NOT EXISTS WAREHOUSE_PRODUCT (\n"
                + "    idWProduct integer NOT NULL,\n"
                + "    idWCategory integer NOT NULL,\n"
                + "    name text NOT NULL,\n"
                + "    amount integer NOT NULL,\n"
                + "    minimumAmount integer NOT NULL,\n"
                + "    FOREIGN KEY(idWCategory) REFERENCES WAREHOUSE_CATEGORY(idWCategory),\n"
                + "    PRIMARY KEY(idWProduct, idWCategory)\n"
                + ");";

        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                ) {
            // create a new table
            stmt.execute(sql1);
            stmt.execute(sql2);
            stmt.execute(sql3);
            stmt.execute(sql4);
            stmt.execute(sql5);
            stmt.execute(sql6);
            stmt.execute(sql7);
            stmt.execute(sql8);
            stmt.execute(sql9);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTable();
    }
}
