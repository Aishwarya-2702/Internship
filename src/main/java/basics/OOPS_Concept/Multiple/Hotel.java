package basics.OOPS_Concept.Multiple;

public class Hotel extends Meals implements Lunch,MorningTiffin,NightDinner{
    public static void main(String[] args) {
        Hotel hh = new Hotel();
        hh.dinner();
        hh.lunch();
        hh.tiffin();
        hh.mealslunch();
    }

    @Override
    public void mealslunch() {
        System.out.println("Lunch is Provided");
    }

    @Override
    public void tiffin() {
        System.out.println("Tiffen is Provided");
    }

    @Override
    public void dinner() {
        System.out.println("Dinner is Provided");
    }
}
