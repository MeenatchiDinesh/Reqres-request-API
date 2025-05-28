package reqres.GET.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc04_ListResourceTestCase extends Utility{

	@Test
	public static void listResource() {

		getResponseObject(getCellData("List resource",1,0),getCellData("List resource",1,1));
		validateResponseCode(getCellData("List resource",1,3));
		validateResponseBody(getCellData("List resource",1,2).toLowerCase());
			
	}

}
