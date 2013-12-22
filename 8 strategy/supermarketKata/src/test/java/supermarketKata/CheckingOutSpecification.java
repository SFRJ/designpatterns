package supermarketKata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;
import supermarketKata.model.SoldByWeightItem;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 02/09/13
 * Time: 12:37
 * To change this template use File | Settings | File Templates.
 */
public class CheckingOutSpecification {

    private Map<String,Sellable> items;
    private SoldByWeightItem bread;
    private SoldByUnitItem noodles;
    private SoldByUnitItem soup;

    @Before
    public void prepareSomeItems() {
        items = new HashMap<String, Sellable>();
        bread = new SoldByWeightItem("Loaf of bread",1D,300);
        noodles = new SoldByUnitItem("Noodles",0.5D,1);
        soup = new SoldByUnitItem("Soup cans",2D,1);
        items.put(bread.getName(), bread);
        items.put(noodles.getName(), noodles);
        items.put(soup.getName(), soup);
    }

    @Test
    public void thePriceOfEveryItemIsAddedUpAtCheckOut() {
        PaymentPoint paymentPoint = new PaymentPoint();
        double cartPrice = paymentPoint.checkOut(items);
        assertThat(cartPrice,is(5.5D));
    }

    private PrintStream originalConsoleOutput = new PrintStream(System.out);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() throws FileNotFoundException {
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleanUpStreams() {
        System.setOut(originalConsoleOutput);
    }

    @Test
    public void thePriceOfEachItemIsPrinted() {
       PaymentPoint paymentPoint = new PaymentPoint();
       paymentPoint.checkOut(items);
        assertEquals("2.0\n0.5\n1.0\n", outContent.toString());
    }

    @Test
    public void calculateItemPriceByWeight() {
        PaymentPoint paymentPoint = new PaymentPoint();
        items = new HashMap<String, Sellable>();
        bread = new SoldByWeightItem("Loaf of bread",1D,300);
        items.put(bread.getName(), bread);
        double total = paymentPoint.checkOut(items);
        assertThat(total,is(3D));
    }

    @Test
    public void ifTheCustomerBuys4SoupsGets1ForFree() {
        PaymentPoint paymentPoint = new PaymentPoint();
        items = new HashMap<String, Sellable>();
        soup = new SoldByUnitItem("Soup cans",2D,4);
        items.put(soup.getName(), soup);
        paymentPoint.checkOut(items);
        assertThat(items.get("Soup cans").getQuantity(),is(5));
    }

    @Test
    public void every3NoodlesGetOneForFree() {
        PaymentPoint paymentPoint = new PaymentPoint();
        items = new HashMap<String, Sellable>();
        noodles = new SoldByUnitItem("Noodles",2D,6);
        items.put(noodles.getName(), noodles);
        paymentPoint.checkOut(items);
        assertThat(items.get("Noodles").getQuantity(),is(8));
    }
}
