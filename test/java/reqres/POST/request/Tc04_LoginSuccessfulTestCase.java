package reqres.POST.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc04_LoginSuccessfulTestCase extends Utility{

	
	@Test
	public void loginSuccessful() {
		
		String payload[] = {getCellData("Login successful",1,0),
				getCellData("Login successful",2,0),
				getCellData("Login successful",3,0),
				getCellData("Login successful",4,0)};
		attachPayloadAsHashMap(payload);
		getResponseObject(getCellData("Login successful",1,1), getCellData("Login successful",1,2));
        validateResponseBody(getCellData("Login successful",1,3));
		validateResponseCode(getCellData("Login successful",1,4));
		
	} 
}
