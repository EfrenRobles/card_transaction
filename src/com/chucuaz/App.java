package com.chucuaz;

import com.chucuaz.authorizer.Authorizer;
import com.chucuaz.authorizer.Authorizer.Builder;

import java.util.Scanner;

/**
 * The APP takes the data from STDIN using the Scanner class and send each line
 * to the authorizer and return the result via STDOUT
 */
public class App {

    /**
     * Main function that is the starting point of the application
     * @param args
     */
    public static void main(String[] args) {
        Builder builder = Authorizer.Builder.anAuthorizer();
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            builder.withInput(scan.nextLine());
        }


        scan.close();
        
        builder.Build().execute().getList().forEach(System.out::println);
        
        System.out.println("******************");

    }
}
