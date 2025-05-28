package reqres.POST.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_CreateTestCase extends Utility {

	@Test(enabled = true)
	public void create() {
		
		String payload[] = {getCellData("Create",1,0),
				getCellData("Create",2,0),
				getCellData("Create",3,0),
				getCellData("Create",4,0)};
		
		attachPayloadAsHashMap(payload);
		getResponseObject(getCellData("Create",1,1), getCellData("Create",1,2));
        validateResponseBody(getCellData("Create",1,3));
        validateResponseCode(getCellData("Create",1,4));
		
	}
	

}
