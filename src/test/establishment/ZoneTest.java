package test.establishment;

import main.establishment.Table;
import main.establishment.Zone;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Testing unit for Zone class
 *
 * @author Jon Leiñena  - https://github.com/jonleinena
 * @author Mikel Ferrer - https://github.com/FerreMikel
 */
public class ZoneTest {
    Zone z1;
    Table t1;
    Table t2;

    @Before
    public void setUp() throws Exception {
        ArrayList<Table> tableList = new ArrayList<>();
        this.t1 = new Table(01, true);
        this.t2 = new Table(02,false);
        tableList.add(t1);
        tableList.add(t2);
        this.z1 = new Zone(01, tableList);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addTable() {
        Table t3 = new Table(03);
        z1.addTable(t3);
        Assert.assertEquals(3, z1.getTables().size());
        Assert.assertEquals(t3, z1.getTables().get(2));
    }

    @Test
    public void removeTable() {
        z1.removeTable(t1);
        Assert.assertEquals(1, z1.getTables().size());
        Assert.assertEquals(t2, z1.getTables().get(0));
    }
}
