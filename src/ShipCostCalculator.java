public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        double item = 10;
        final double SHIPPING_PERCENT = 0.02;
        double shippingCost = 0;
        double itemAndShipping = 0;

        if (item >= 100) {
            itemAndShipping = item;
            System.out.println("Your shipping price is " + shippingCost + ". " + "Your price is " + itemAndShipping + ".");
    }
        else {
            shippingCost = item * SHIPPING_PERCENT;
            itemAndShipping = shippingCost + item;
            System.out.println("Your shipping cost is " + shippingCost + ". " + "Your total cost is " + itemAndShipping + ".");
        }
    }
}