package basics.Assignment2;

public class SIP_Calculator {
    static int periodInYears = 5; //static variable
    public void calc()//local variable
    {
        int monthlyInvestment = 1000;
        int expectedReturnsInPercent = 12;
        System.out.println("Principle Amount: " + principleAmount);
        System.out.println("Estimated Returns: " + estimatedReturns);
    }
    static int monthlyInvestment = 1000;
    static int expectedReturnsInPercent = 12;
    static int principleAmount = monthlyInvestment * periodInYears
            * 12;
    static int estimatedReturns = principleAmount *
            expectedReturnsInPercent / 100;
    static int Total = principleAmount + estimatedReturns;
    public static void main(String[] args) {
        SIP_Calculator cal=new SIP_Calculator();
        cal.calc();
        System.out.println("Total: " + Total);
        System.out.println("SIP Calculator Successfully Executed");
    }
}
