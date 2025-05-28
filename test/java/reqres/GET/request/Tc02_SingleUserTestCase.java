package reqres.GET.request;

import java.io.IOException;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc02_SingleUserTestCase extends Utility{

	@Test
	public static void singleUser() throws IOException{

		setPathParameter(getCellData("Single user",1,0), getCellData("Single user",2,0));
		getResponseObject(getCellData("Single user",1,1), getCellData("Single user",1,2));
		validateResponseBody(getCellData("Single user",1,3),getCellData("Single user",2,3));
		validateResponseCode((getCellData("Single user",1,4)));
		
		
	}

}
