package net.davepkennedy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

public class PersonTest {
  private static final String TEST_NAME = "Danny";
  private static final int TEST_AGE = 4;

  private Person person;

  @BeforeMethod
  public void setup () {
    this.person = new Person (TEST_NAME, TEST_AGE);
  }

  @Test
  public void hasName () {
    System.out.println ("hasName");
    Assert.assertEquals (this.person.getName (), TEST_NAME);
  }

  @Test
  public void hasAge () {
    System.out.println("hasAge");
    Assert.assertEquals (this.person.getAge (), TEST_AGE);
  }
}
