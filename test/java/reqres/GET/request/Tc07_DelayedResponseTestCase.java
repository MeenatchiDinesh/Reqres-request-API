package reqres.GET.request;

import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc07_DelayedResponseTestCase extends Utility {

	@Test
	public static void delayedResponse() {

		setQuaryParameter(getCellData("Delayed response",1,0),getCellData("Delayed response",2,0));
		getResponseObject(getCellData("Delayed response",1,1).toLowerCase(),getCellData("Delayed response",1,2));
		validateResponseCode(getCellData("Delayed response",1,3));

	}

}
