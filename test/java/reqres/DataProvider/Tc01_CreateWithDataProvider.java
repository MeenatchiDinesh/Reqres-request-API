package reqres.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReqresUtility.Utility;

public class Tc01_CreateWithDataProvider extends Utility {

	@Test(dataProvider = "Users")
	public void createWithDataProvider(String key1, String value1, String key2, String value2) {
		
		String payload[] = { key1, value1, key2, value2 };
		attachPayloadAsHashMap(payload);
		getResponseObject(getCellData("Create", 1, 1), getCellData("Create", 1, 2));
		validateResponseBody(getCellData("Create", 1, 3));
		validateResponseCode(getCellData("Create", 1, 4));
	}

	@DataProvider(name = "Users")
	public Object[][] dataProvider() throws IOException {

		Object data[][] = {
				{ getExcellData("Data provider", 0, 0), getExcellData("Data provider", 1, 0),
						getExcellData("Data provider", 0, 1), getExcellData("Data provider", 1, 1) },
				{ getExcellData("Data provider", 0, 0), getExcellData("Data provider", 2, 0),
						getExcellData("Data provider", 0, 1), getExcellData("Data provider", 2, 1) },
				{ getExcellData("Data provider", 0, 0), getExcellData("Data provider", 3, 0),
						getExcellData("Data provider", 0, 1), getExcellData("Data provider", 3, 1) } };

		return data;

	}

}
