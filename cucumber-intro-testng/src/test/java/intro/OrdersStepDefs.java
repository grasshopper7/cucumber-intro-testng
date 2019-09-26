package intro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersStepDefs {

	@Given("Customer reads the menu")
	public void customer_reads_the_menu() {
		System.out.println("GIVEN - Customer reads the menu");
	}

	@When("Orders one Margherita pizza")
	public void orders_one_Margherita_pizza() {
		System.out.println("WHEN - Orders one Margherita pizza");
	}

	@Then("Kitchen should receive the order")
	public void kitchen_should_receive_the_order() {
		System.out.println("THEN - Kitchen should get order");
	}
}
