package edu.ldsbc.assinment3;



import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by XPS on 2/1/2017.
 */
public class CheckoutTest {

    @Test
    public void shopCheckout() throws Exception {

        List<DessertItem> myItems = new ArrayList<DessertItem>();
        DessertItem candy = new Candy();
        myItems.add(candy);
        DessertItem candyBar = new Candy();
        myItems.add(candyBar);
        DessertItem iceCream = new IceCream();
        myItems.add(iceCream);

        Checkout checkout = new Checkout();
        assertEquals(23.1, checkout.totalCost(myItems));

    }





}