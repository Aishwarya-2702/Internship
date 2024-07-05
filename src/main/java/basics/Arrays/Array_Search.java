package basics.Arrays;

import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        String[] food = {"Biryani","chapathi","Noodles","Naan","Fullmeals"};
        Scanner scan=new Scanner(System.in);
        System.out.println(food.length);
        System.out.println("Tell us Your favourite food??");
        String fav=scan.next();

        for(int pos=0;pos<food.length;pos++){
            if(fav.equalsIgnoreCase(food[pos]))
            {
                System.out.println(fav+"Favourite food is found");
                return;
            }
            else {
                System.out.println(fav+"Favourite food is not found");
            }
        }
        System.out.println(fav+"Favourite food is not found");
    }
}
