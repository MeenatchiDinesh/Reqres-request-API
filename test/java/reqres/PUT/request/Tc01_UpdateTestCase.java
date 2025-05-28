package reqres.PUT.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_UpdateTestCase extends Utility{

	@Test
	public static void update(){
		
		String payload[] = {getCellData("Update",1,0)
				,getCellData("Update",2,0),
				getCellData("Update",3,0),
				getCellData("Update",4,0)};
		
		setPathParameter(getCellData("Update",1,1), getCellData("Update",2,1));
		attachPayloadAsJSON(payload);
		getResponseObject(getCellData("Update",1,2), getCellData("Update",1,3));
		validateResponseBody(getCellData("Update",1,4));
		validateResponseCode(getCellData("Update",1,5));
		
	}

}
