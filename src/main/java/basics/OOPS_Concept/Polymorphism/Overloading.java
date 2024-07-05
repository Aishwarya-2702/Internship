package basics.OOPS_Concept.Polymorphism;

public class Overloading {
    public void Shopping(String cart1,String cart2)
    {
        if (cart1 == cart2)
        {
            System.out.println("Your cart item is same ");
        }
        else {
            System.out.println("Your cart item is not same");
        }
    }
    public int Shopping(int item1,int item2)
    {
        int item3 = item1+item2;
        System.out.println(item3);
        return item3;
    }
    public void Shopping(Float price1, Float price2)
    {
        double price3 = price1+price2;
        System.out.println("The price of the item is: "+price3);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.Shopping("Noodles","Noodles");
        overloading.Shopping(2,2);
        overloading.Shopping(25.50f,25.50f);
    }
}
