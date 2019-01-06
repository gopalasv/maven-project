package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
/**
* @param something to be passed
* @return something to be returned
*/

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
