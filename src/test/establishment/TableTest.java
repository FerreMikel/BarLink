package test.establishment;

import main.establishment.Table;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing unit for Table class
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class TableTest {
    Table t1;
    Table t2;
    Table t3;

    @Before
    public void setUp() throws Exception {
        this.t1 = new Table();
        this.t2 = new Table(02, false);
        this.t3 = new Table(03, true);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getIdTable() {
        Assert.assertEquals(0, t1.getIdTable());
        Assert.assertEquals(02, t2.getIdTable());
        Assert.assertEquals(03, t3.getIdTable());
    }

    @Test
    public void setIdTable() {
        t1.setIdTable(01);
        Assert.assertEquals(01, t1.getIdTable());
    }

    @Test
    public void bookTable() {
        t1.bookTable();
        Assert.assertEquals(true, t1.tableStatus());
    }

    @Test
    public void tableStatus() {
        Assert.assertEquals(false, t2.tableStatus());
    }

    @Test
    public void unbookTable() {
        t2.unbookTable();
        Assert.assertEquals(false, t2.tableStatus());
    }

}
