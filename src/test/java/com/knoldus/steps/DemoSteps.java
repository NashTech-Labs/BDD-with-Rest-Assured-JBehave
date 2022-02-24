package com.knoldus.steps;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.json.simple.JSONObject;
public class DemoSteps {
    private Response response;
    @Given("I provide the correct API URL")
    public void I_provide_the_correct_API_URL() {
        RestAssured.baseURI = "https://reqres.in/";
    }
    @When("I set the request body and make a POST request")
    public void I_set_the_request_body_and_make_a_POST_request() {
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject requestParams = new JSONObject();         //setting request body
        requestParams.put("name", "abc");
        requestParams.put("job", "manager");
        httpRequest.header("Content-Type", "application/json");         // specifying headers here, stating that the request body is json
        httpRequest.body(requestParams.toJSONString());        // add the json body to the request payload
        response = httpRequest.request(Method.POST, "api/users");         // Sending POST request
    }
    @Then("I assert the successful status code, 201")
    public void I_assert_the_successful_status_code_201() {
        response.prettyPrint();
        int status = response.getStatusCode();        // to capture response code through getStatusCode method.
        Assert.assertEquals(201, status);
    }
}
