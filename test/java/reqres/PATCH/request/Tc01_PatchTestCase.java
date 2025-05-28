package reqres.PATCH.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_PatchTestCase extends Utility{

	@Test
	public static void patch() {
		
		String payload[] = {getCellData("Patch",1,0),
				getCellData("Patch",2,0),
				getCellData("Patch",3,0),
				getCellData("Patch",4,0)};
		
		setPathParameter(getCellData("Patch",1,1),getCellData("Patch",2,1));
		attachPayloadAsJSON(payload);
		getResponseObject(getCellData("Patch",1,2), getCellData("Patch",1,3));
		validateResponseBody(getCellData("Patch",1,4));
		validateResponseCode(getCellData("Patch",1,5));
		
	}

}
