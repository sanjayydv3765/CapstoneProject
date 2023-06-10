package constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import base.TestBase;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GlobalConstants {

    public String appURL = "http://localhost:8090/medicare/";
    public String count = "1";
    public String Productname = "Marshall";
    public String BrandName = "Bilazap";
    public String Description = "Used ofr Skin related pronblems";
    public String Price = "129.00";
    public String browser = "chrome";

    public String Quantity = "50";
    public String Catogoryy = "1";
    public String ShowSerach = "ALL";
    public String catname = "Skinallergy";
    public String catDescription = "Tablet";
    	
    public String filepath = "E:\\Capstone1\\Simplilearn_Capstone-Medicare\\Screenshot (10).png";
    public String Add1 = "89/90, bhu Mkil";
    public String Add2 = "78/34 The mikd";
    public String postalcode = "313001";
    public String city = "Udaipur";
    public String Country = "India";
    public String State = "Rajasthan";
    
    public String cardnum = "8989898989";
    public String month = "12";
    public String year = "90";
    public String cvvcode = "7777";
    public String Selectedtab1 = "Paracetamol";
    public String Selectedtab2 = "Combiflame";
    
    
    //Register

    
    public String regfirstname = "Dinesh";
    public String regLastname = "K";
    public static String email = TestBase.getRandomemail();
    public String regContact = "8209058373";
    public String regPassword = "Dinesh123";
    public String regAddress1 = "Test villa";
    public String regAddress2 = "Pali";
    public String regCity = "Pali";
    public String regPostalcode = "306401";
    public String regState = "Rajasthan";

    //API
    
    public static RequestSpecification request;
    public static Response response;
    public static HashMap<Object, Object> map = new HashMap<Object,Object>();
    public static List<String> apiProduct = new ArrayList<String>();
    public static List<String> apicatProduct = new ArrayList<String>();
    public static List<String> UIproduct = new ArrayList<String>();
    
    //DB
    
    public static String dbcatname = "Datapeb";
    public static String dbdescription = "This drug cures headache";
    public static String dbimage = "E:\\Capstone1\\Simplilearn_Capstone-Medicare\\Screenshot (10).png";
}









