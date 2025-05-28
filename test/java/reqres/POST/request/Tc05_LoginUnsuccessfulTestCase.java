package reqres.POST.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc05_LoginUnsuccessfulTestCase extends Utility{

	
	@Test
	public void loginUnsuccessful() {
		
		String payload[] = {getCellData("Login unsuccessful",1,0),
				            getCellData("Login unsuccessful",2,0)};
		attachPayloadAsHashMap(payload);
		getResponseObject(getCellData("Login unsuccessful",1,1), getCellData("Login unsuccessful",1,2));
		validateResponseBody(getCellData("Login unsuccessful",1,3));
		validateResponseCode(getCellData("Login unsuccessful",1,4));

	} 
}
