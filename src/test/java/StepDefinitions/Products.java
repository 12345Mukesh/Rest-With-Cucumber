package StepDefinitions;

import static io.restassured.RestAssured.*;


import com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Random;


public class Products
{
    /*
     Checking by directly writing code instead of step definitions
     */

    RequestSpecification httpreq;
    Response response;
    Response newresp;
    int Responsecode;
    ResponseBody body;

    HashMap json;
    Random rand=new Random();
    int rn=rand.nextInt(1000);


 @Given("I hit url of get products api endpoint")
    public void I_hit_url_of_get_products_api_endpoint()
 {
     RestAssured.baseURI="https://fakestoreapi.com/";

 }

 @When("I pass the url of products in request")
    public void I_pass_the_url_of_products_in_request()
 {
     httpreq=RestAssured.given();
     response=httpreq.get("products");
 }


 @Then("I receive the response code as 200")
    public void I_receive_the_response_code_as_200()
 {
    Responsecode= response.getStatusCode();
     Assert.assertEquals(Responsecode,200);

 }

 @Then("I verify that the rate of first product is {}")
    public void I_verify_that_the_rate_of_first_product_is(String rate)
 {
     body=response.getBody();

     //convert response body to string
     String responsebody=body.asString();
     System.out.println("All objects value: " +responsebody);

     JsonPath jsonpath=response.jsonPath();

     //Retrieving value from jsonpath and converting tostring
     String s=jsonpath.getJsonObject("rating[0].rate").toString();
    System.out.println("rating[0].rate= "+s);


     Assert.assertEquals(rate,s);

 }

//For post api
    @Given("I hit the url of post product api endpoint")
    public void Ihittheurlofpostproductapiendpoint()
    {
        RestAssured.baseURI="https://fakestoreapi.com/";
         httpreq=RestAssured.given();
      json= new HashMap();



    }

    @And("I pass the request body of product title {}")
    public void Ipasstherequestbodyofproducttitle(String prodtitle)
{
    json.put("title",prodtitle);
    json.put("price",13.5+rn);
    json.put("description","lorem ipsum set"+rn);
    json.put("image","https://i.pravatar.co");
    json.put("category","electronic");
    //Request specification
    httpreq.body(json.toString());
    //Respone main method
   response=httpreq.post("products");
    ResponseBody body=response.getBody();
    System.out.println("Response status code is: "+response.getStatusLine());
    System.out.println("Inserted body is: "+body.asString());

}


    @Then("I receive the response body with id as {}")
    public void iReceiveTheResponseBodyWithIdAsId(String id)
    {
        JsonPath jsonp=response.jsonPath();
        String json=jsonp.getJsonObject("id").toString();
        Assert.assertEquals(json,id);

    }

}
