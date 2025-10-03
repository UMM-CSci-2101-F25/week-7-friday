package umm2101;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestExample {
  private static final Logger logger = Logger.getLogger(TestExample.class.getName());
  // You might want to have a thing you use in multiple tests
  // If so, declare it within the class but outside of the tests

  @BeforeEach
  public void setUp() {
    // Whatever is in here will be run before each test
  }
   
  @DisplayName("Test something method")
  @Test
  public void testSomething() {
    /********* Test Something *********/
    // You can log information about what's going on
    logger.info("Hello - this is a logged message from a test");

    // You can print things to the terminal or debug console
    System.out.println("Howdy - this cam from a System.out.println in a test");

    // Make sure that you actually test something in your tst... use assertions for that
    assertNotEquals("expected", "actual");
  }
  
}
