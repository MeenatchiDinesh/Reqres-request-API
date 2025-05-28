package reqres.POST.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc02_RegisterSuccessfulTestCase extends Utility{

	
	@Test
	public void registerSuccessful(){
		
		String payload[] = {getCellData("Register successful",1,0),
				getCellData("Register successful",2,0),
				getCellData("Register successful",3,0),
				getCellData("Register successful",4,0)};

		attachPayloadAsJSON(payload);
	    getResponseObject(getCellData("Register successful",1,1), getCellData("Register successful",1,2));
		validateResponseBody(getCellData("Register successful",1,3));
		validateResponseCode(getCellData("Register successful",1,4));

	} 
}
