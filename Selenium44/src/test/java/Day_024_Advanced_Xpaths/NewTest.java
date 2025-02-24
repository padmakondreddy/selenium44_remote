package Day_024_Advanced_Xpaths;

import org.testng.annotations.Test;
import org.apache.log4j.*;

public class NewTest {

	private static org.apache.log4j.Logger log= Logger.getLogger(NewTest.class);
	@Test
   public static void main(String[] args) {
	  
	  log.trace("This is trace information");
	  log.debug("This is Debug information");
	  log.warn("This is Warn information");
	  log.error("This is Error information");
	  log.fatal("This is Fatal information");
	  
  }
}
