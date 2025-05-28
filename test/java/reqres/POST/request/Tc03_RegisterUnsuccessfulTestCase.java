package reqres.POST.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc03_RegisterUnsuccessfulTestCase extends Utility {

	
	@Test
	public void registerUnsuccessful(){
		
		String payload[] = {getCellData("Register unsuccessful",1,0),
				            getCellData("Register unsuccessful",2,0)};
		attachPayloadAsHashMap(payload);
		getResponseObject(getCellData("Register unsuccessful",1,1), getCellData("Register unsuccessful",1,2));
		validateResponseBody(getCellData("Register unsuccessful",1,3));
		validateResponseCode(getCellData("Register unsuccessful",1,4));
		
	}
}
