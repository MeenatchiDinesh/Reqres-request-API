package reqres.GET.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc06_SingleResourceNotFoundTestCase extends Utility{

	@Test
	public static void singleResourceNotFound() {

		setPathParameter(getCellData("Single resource not found",1,0),getCellData("Single resource not found",2,0));
		getResponseObject(getCellData("Single resource not found",1,1),getCellData("Single resource not found",1,2));
		validateResponseBody("");
		validateResponseCode(getCellData("Single resource not found",1,4));
	}

}
