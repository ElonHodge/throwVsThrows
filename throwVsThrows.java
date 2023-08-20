package com.KBA.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class throwVsThrows {



    public static void main(String[] args)  {


    }

   public static void throwTest(){

//        // Use to rerun program
        boolean loopProgram = true;
//
//        System.out.println("Enter two numbers for division");
//
//        // While the boolean loopProgram = true run the code
//
//       // Created a scanner object with an input source of System.in
//
       Scanner input =  new Scanner(System.in);;
        while (loopProgram) {

            // Try catch to handle the exception

            try {

                System.out.println("Number one");

                // input is the name of the scanner object , nextInt() Scans the next token of the input as an int.
                // This method will throw InputMismatchException if the next token cannot be translated into a valid int.


                int num1 = input.nextInt();

                System.out.println("Number two");

                int num2 = input.nextInt();

                if ((num1 | num2) == 0) //Todo  Throw a new Arithmetic Exception

                    System.out.println("Your answer is: "+num2 / num1);

                loopProgram = false;

                // Todo Add the correct exception for the catch below
            } catch () {
                System.out.println("Please do not use 0");

            } catch () {
                System.out.println("Please only use numbers");
            }
            input = new Scanner(System.in);
        }
        input.close();
    }


    public static void throwsTest()   {
//  A method that throws an uncaught, checked exception must include a throws clause in its declaration.
// TODO Unhandled exception, you have to add the IOException  to the method signature
            Scanner input = new Scanner(System.in);
        System.out.println("Enter file name:");
        Path path = Paths.get("src/com/KBA/exceptions/"+input.nextLine());

        if (Files.exists(path)){
            System.out.println(Files.size(path));
        }

    }
}
