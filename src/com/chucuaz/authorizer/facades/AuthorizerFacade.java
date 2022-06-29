package com.chucuaz.authorizer.facades;

import java.util.Scanner;

import com.chucuaz.authorizer.Authorizer.Builder;

/**
 * AuthorizerFacade takes the data from STDIN using the Scanner class and send each line
 * to the authorizer and return the result via STDOUT
 */
public class AuthorizerFacade {

    private Builder builder = Builder.anAuthorizer();

	public AuthorizerFacade stdIn(Scanner scan) {
      while (scan.hasNext()) {
          builder
            .withInput(scan.nextLine());
      }
      
      scan.close();
      
      return this;
    }

    public void stdOut() {
        builder
            .Build()
            .execute()
            .getList()
            .forEach(System.out::println);
    }
}
