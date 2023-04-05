package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.*;

public class BankAccountSteps {
	
	private BankAccount monAccount;
	private int i_montant;

	@Given("je suis sur la page de depot avec un {int} dans mon compte")
	public void je_suis_sur_la_plage_de_depot(int solde) {
		System.out.println("dans given");
		monAccount=new BankAccount(solde);
	}
	
	@When("je remplis le champ avec un {int}")
	public void je_remplis_le_champ_avec_un_montant(int montant) {
		System.out.println("Dans When");
		i_montant=montant;
	}
	@And("je clique sur Deposer")
	public void je_clique_sur_deposer() {
		System.out.println("dans and");
		monAccount.deposit(i_montant);
	}
	
	@Then("je devrais voir un message de depot effectue avec succes et le solde {int}")
	public void je_devrait_voir_un_message_de_depot_effectue_avec_succes(int soldeAttandue) {
		System.out.println("Dans Then");
		assertEquals(soldeAttandue,monAccount.checkBalance(),0.1);
	}
	
	@And("je clique sur retire")
	public void je_clique_sur_retirer() {
		System.out.println("dans and");
		monAccount.withdraw(i_montant);
	}
	
	@Then("je devrais voir un message de retrait effectue avec succes et le solde {int}")
	public void je_devrait_voir_un_message_de_retrait_effectue_avec_succes(int soldeAttandue) {
		System.out.println("Dans Then");
		assertEquals(soldeAttandue,monAccount.checkBalance(),0.1);
	}
}
