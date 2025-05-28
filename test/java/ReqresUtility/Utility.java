package ReqresUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utility {
	
	public static RequestSpecification requestSpecification ;
    public static Response response;
	
    @BeforeMethod
	public static void setRequestSpecificationObject() {
    	
    	
    	
		RestAssured.baseURI = "https://reqres.in";
		requestSpecification = RestAssured
				.given()
				.header("x-api-key","reqres-free-v1")
				.header("Content-Type", "application/json");
	}
	
	public static void setQuaryParameter(String key,String value) {
		requestSpecification.queryParam(key, value);
	}
	
	public static void setPathParameter(String key,String value) {
		requestSpecification.pathParam(key, value);
	}
	
	public static void getResponseObject(String method,String resource) {
		
		switch(method) {
		case "get":
			response = requestSpecification.request(Method.GET, resource);
			break;
		case "post":
			response = requestSpecification.request(Method.POST, resource);
			break;
		case "put":
			response = requestSpecification.request(Method.PUT, resource);
			break;
		case "patch":
			response = requestSpecification.request(Method.PATCH, resource);
			break;
		case "delete":
			response = requestSpecification.request(Method.DELETE, resource);
			break;
		}
	}
	
	@AfterMethod
	public static void printResponse() {
		System.out.println("RESPONSE CODE IS " + response.getStatusCode());
		System.out.println("\nRESPONSE BODY IS \n" + response.getBody().asPrettyString());
	}
	
	public static void validateResponseCode(String code) {
		response.then().assertThat().statusCode(Integer.valueOf(code));
	}
	
	public static void validateResponseBody(String key,String expectedValue) {
		response.then().assertThat().body(key, Matchers.equalTo(Integer.valueOf(expectedValue)));
	}
	
	public static void validateResponseBody(String text) {
		response.then().assertThat().body(Matchers.containsString(text));
	}
	
	@SuppressWarnings("unchecked")
	public static void attachPayloadAsJSON(String[] payload) {		
		JSONObject jSONObject = new JSONObject();
		
		for(int i =0;i<payload.length;i++) {
			jSONObject.put(payload[i],payload[i+1]);	
			i++;
		}
		requestSpecification.body(jSONObject.toJSONString());
				
	}
	
	public static void attachPayloadAsHashMap(String[] data) {		
		HashMap<String,Object>hm = new HashMap<String, Object>();
		
		for(int i =0;i<data.length;i++) {
			hm.put(data[i],data[i+1]);	
			i++;
		}
		requestSpecification.body(hm);
				
	}
	
	public static String getCellData(String sheetName, int rowNmum, int colunmNum) {

		String data = null;
		try {
			File file = new File("/Users/Meenatchi/eclipse-workspace/ReqresRequestsWithBaseClass/src/test/resources/ReqresWorkSheet.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			try (Workbook book = new XSSFWorkbook(fileInputStream)) {
				Cell cell = book.getSheet(sheetName).getRow(rowNmum).getCell(colunmNum);
				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:

					data = cell.getStringCellValue();
					
				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
						data = simpleDateFormat.format(cell.getDateCellValue());
					} else {
						double numericCellValue = cell.getNumericCellValue();
						long value = (long) numericCellValue;
						data = BigDecimal.valueOf(value).toString();
					}

				default:
					break;
				}
			}

		} catch (Exception iOException) {
		}

		return data;
	}

	public static String getExcellData(String sheet,int row,int column) throws IOException {
		@SuppressWarnings("resource")
		Workbook book = new XSSFWorkbook(new FileInputStream(new File("/Users/Meenatchi/eclipse-workspace/ReqresRequestsWithBaseClass/src/test/resources/Data provider.xlsx")));
		return book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
	}
	
	
}
