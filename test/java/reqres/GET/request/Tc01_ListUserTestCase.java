package reqres.GET.request;



import java.io.IOException;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_ListUserTestCase extends Utility{

	@Test
	public void listUser() throws IOException {
		
		setQuaryParameter(getCellData("List user",1,0),getCellData("List user", 2, 0));
		getResponseObject(getCellData("List user",1,1), getCellData("List user",1,2));
		validateResponseBody(getCellData("List user",1,3), getCellData("List user",2,3));
		validateResponseCode(getCellData("List user",1,4));
		
	}

}
