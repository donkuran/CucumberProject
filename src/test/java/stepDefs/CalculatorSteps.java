package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	int result = 0;

	@When("I add {int} And {int}")
	public void i_eadd_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions

		result = num1 + num2;
	}

	@Then("I get the result {int}")
	public void i_get_the_result(int res) {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertEquals(res, result);
	}

	@When("I sub {int} And {int}")
	public void i_sub_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions

		result = num1 - num2;
	}

	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions

		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {

			result += Integer.parseInt(dataTable.cell(i, 0));
		}
	}

	@When("I add below numbers using list")
	public void i_add_below_numbers_using_list(List<Integer> numbers) {
		// Write code here that turns the phrase above into concrete actions

		for(Integer num: numbers) {
			
			result += num;
		}
	}
	
	@When("I order below items")
	public void i_order_below_items(Map<String, Integer> priceList) {
	    // Write code here that turns the phrase above into concrete actions

		for(String key: priceList.keySet()) {
			
			result += priceList.get(key);
		}
	}

	@When("I order below items and quantity")
	public void i_order_below_items_and_quantity(io.cucumber.datatable.DataTable dataTable) {
	    
		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {

			int quantity = Integer.parseInt(dataTable.cell(i, 1));
			float price = Integer.parseInt(dataTable.cell(i, 2));
			
			result += (quantity * price);
		}
	}

}
