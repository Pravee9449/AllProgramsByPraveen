package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  
  
  
  @Test(priority= 1)
  public void demo() { 
	Reporter.log("hello java", true);
  }
  
  @Test
  public void chats() {
  Reporter.log("chatting", true);
  }
  
  @Test(priority= -1)
  public void meassages() {
	  Reporter.log("msg", true);
  }
  
  
   
}
