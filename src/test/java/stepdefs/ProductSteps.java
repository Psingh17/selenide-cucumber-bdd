package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import pages.ProductPage;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ProductSteps {

    ProductPage product = new ProductPage();

    @Given("user open the product page")
    public void gotoProductPage() {
        product.openProductPage();
    }

    @Then("user should see the products contains the following products:")
    public void verify_product_names(DataTable dataTable) {
        List<String> expectedProducts = dataTable.asList();
        List<String> actualProducts = product.getAllProductsText().stream().map(String::toLowerCase).toList();
        //Attach actual products list to Allure
        Allure.addAttachment("Actual Product List", String.join("\n", actualProducts));

        for (String expected : expectedProducts) {

            assertTrue(actualProducts.contains(expected.toLowerCase()), "Product not found " + expected);
        }
    }


}
