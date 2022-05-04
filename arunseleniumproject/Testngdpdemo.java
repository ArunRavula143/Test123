package arunseleniumproject;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testngdpdemo {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "avhaddv", "a" },
      new Object[] { "bvjk", "b" },
      new Object[] {"bvbvjh","c"}
    };
  }
}
