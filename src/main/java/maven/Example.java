package maven;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

      //  ArrayList<String> instantiatedList = new ArrayList<>()  instantiated list.
        // 1. prompt user to enter string  sout
        //2. get string from user  scanner
        //3. determine whether user sting is a number use string noodles for that  utils
        //4 flip case of string string utils.
        //5. reverse the string utils.
        //6. print out restuls of steps 3-5.
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Give us a word");
        String input = scanner.nextLine();
        System.out.printf("you entered :%s" input.);
        String isNotANumberMessage;
        if (StringUtils.isNumeric((input))) {
            isNotANumberMessage = "is a number";

        }else{
            isNotANumberMessage ="is not a number"
        }
        System.out.printf("\"%s\"%s \n", input, isNotANumberMessage);
        System.out.println("flipped case: %s\n", StringUtils.swapCase((input)));
        System.out.println("reverse word", StringUtils.reverse((input));

    }
}
