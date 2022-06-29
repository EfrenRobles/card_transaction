package com.chucuaz;

import java.util.Scanner;
import com.chucuaz.authorizer.facades.AuthorizerFacade;

public class App {

    public static void main(String[] args) {

        new AuthorizerFacade()
            .stdIn(new Scanner(System.in))
            .stdOut();
    }
}
