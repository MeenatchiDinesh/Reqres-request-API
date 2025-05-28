package reqres.GET.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc05_SingleResourceTestCase extends Utility {

	@Test
	public static void singleResource(){

		setPathParameter(getCellData("Single resource",1,0),getCellData("Single resource",2,0));
		getResponseObject(getCellData("Single resource",1,1),getCellData("Single resource",1,2));
		validateResponseBody(getCellData("Single resource",1,3));
		validateResponseBody(getCellData("Single resource",2,3), getCellData("Single resource",3,3));
		validateResponseCode(getCellData("Single resource",1,4));
	}

}
