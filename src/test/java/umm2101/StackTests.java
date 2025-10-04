package umm2101;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTests {
  // You might want to have a thing you use in multiple tests
  // If so, declare it within the class but outside of the tests
  Stack<Integer> myStack;

  @BeforeEach
  public void setUp() {
    // Whatever is in here will be run before each test
    myStack = new AStack<>();
  }
   
  @DisplayName("Top Value Test - empty")
  @Test
  public void testTopValueWhenEmpty() {
    /********* Test Top Value *********/
    assertNull(myStack.topValue());
  }

  @DisplayName("Top Value Test - has items")
  @Test
  public void testTopValueWhenNotEmpty() {
    myStack.push(45);
    assertEquals(45, myStack.topValue());
  }

  @Test
  public void testPushWhenFull() {
    for (int i=0; i<10; i++) {
        assertTrue(myStack.push(i));
    }
    assertEquals(10, myStack.length());
    assertFalse(myStack.push(1111));
    assertEquals(10, myStack.length());
  }
  
  @Test
  public void testPop() {
    myStack.push(5);
    assertEquals(1, myStack.length());
    assertFalse(myStack.isEmpty());
    assertEquals(5, myStack.pop());
    assertEquals(0, myStack.length());
    assertTrue(myStack.isEmpty());
    assertNull(myStack.pop());
  }

  @Test
  public void testClear() {
    assertEquals(0, myStack.length());
    myStack.push(1);
    myStack.push(2);
    assertEquals(2, myStack.length());
    myStack.clear();
    assertNull(myStack.topValue());
    assertEquals(0, myStack.length());
    assertTrue(myStack.isEmpty());
  }

  // mvn clean jacoco:prepare-agent install jacoco:report
}
