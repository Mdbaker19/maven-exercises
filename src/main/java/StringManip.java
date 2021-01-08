import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");

        String input = sc.nextLine();

        System.out.printf("You Entered : \"%s\"%n", input);

        if(StringUtils.isNumericSpace(input)){
            System.out.printf("\"%s\" is a number%n", input);
        } else{
            System.out.printf("\"%s\" is not a number%n", input);
        }
        String flipped = StringUtils.swapCase(input);
        String reverse = StringUtils.reverse(input);
        System.out.println("Flipped Case: " + flipped);
        System.out.println("Reversed: " + reverse);



    }
}
