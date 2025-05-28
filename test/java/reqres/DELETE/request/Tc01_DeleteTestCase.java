package reqres.DELETE.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_DeleteTestCase extends Utility{

	@Test
	public static void delete(){

		
		setPathParameter(getCellData("Delete",1,0), getCellData("Delete",2,0));
		getResponseObject(getCellData("Delete",1,1), getCellData("Delete",1,2));
		validateResponseCode(getCellData("Delete",1,3));
		
	}

}
