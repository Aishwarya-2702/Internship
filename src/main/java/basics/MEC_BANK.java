package basics;

public class MEC_BANK {
   static String contact = "8148794224";
   static String email = "aishugeetha27@gmail.com";
   public void SB_account()
   {
       String name = "Aishwarya S";
       String dob = "27/02/2005";
       System.out.println("Customer Name: "+name);
       System.out.println("Date Of Birth: "+dob);
   }
   static String aadhaar = "1234 5678 9024";
   static String pan = "AISHU1234V";
   public static void main(String[] args){
       MEC_BANK acc=new MEC_BANK();
       acc.SB_account();
       System.out.println("Contact Number: "+contact);
       System.out.println("Email Address: "+email);
       System.out.println("Aadhaar Number: "+aadhaar);
       System.out.println("PAN Number: "+pan);
       System.out.println("Application Submitted Successfully" );
   }
}
