package reqres.GET.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc03_SingleUserNotFoundTestCase extends Utility{

	@Test
	public static void singleUserNotFound()  {

		setPathParameter(getCellData("Single user not found",1,0), getCellData("Single user not found",2,0));
		getResponseObject(getCellData("Single user not found",1,1), getCellData("Single user not found",1,2));
		validateResponseCode(getCellData("Single user not found",1,4));
		validateResponseBody("");

	}

}
