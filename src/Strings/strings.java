package Strings;

import java.util.Scanner;

public class strings {
    static void main() {
        String name = "satyam";
        String name2 = "SATYAM";
        String name3 = "satyam";
        String lName = new String("Raghuwanshi");
        System.out.println(name + " " + lName);
        System.out.println(name.charAt(0));
        System.out.println(lName.length());

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }

        if(name == name2){
            System.out.println("both are equal");
        }else {
            System.out.println("both are different");
        }

        if(name == name3){
            System.out.println("both are equal");//equal because of same reference
        }else {
            System.out.println("both are different");
        }

        if(name.equals(name2)){
            System.out.println("both are equal");
        }else {
            System.out.println("both are different");
        }

        if(name.equalsIgnoreCase(name2)){
            System.out.println("both are equal");
        }else {
            System.out.println("both are different");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        System.out.println("nextLine() :" + str1);
        System.out.println("Enter String");
        String str2 = sc.next();
        System.out.println("next() :" + str2);
    }
}
