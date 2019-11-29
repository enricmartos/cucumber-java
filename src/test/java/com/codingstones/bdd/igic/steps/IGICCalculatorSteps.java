package com.codingstones.bdd.igic.steps;

import com.codingstones.bdd.igic.IGICCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class IGICCalculatorSteps {

    private IGICCalculator igicCalculator;
    private float calculatedPrice;

    @Given("^I have an IGIC calculator")
    public void i_get_with_price() throws Throwable {
        igicCalculator = new IGICCalculator();
    }

    @When("^tax is calculated for \"(.*?)\" with (\\d+) price$")
    public void tax_is_calculated(String product, int price) throws Throwable {
        calculatedPrice = igicCalculator.calculateTotal(product, price);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(float priceWithIGIC) throws Throwable {
        assertEquals(priceWithIGIC, calculatedPrice, 0);
    }

    @Then("^the product rate is not found$")
    public void the_product_rate_is_not_found() throws Throwable {
        assertEquals(-1, calculatedPrice, 0);
    }
}