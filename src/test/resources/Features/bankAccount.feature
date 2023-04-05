#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  En tant que client de la banque Universite
  Je veux pouvoir gérer mon compte bancaire
  Afin de controler mes depenses par rapport à ce que je gagne de mon travail et a ce que je retire pour effectuer des paiements

@Depot
Scenario Outline: Deposer avec succes
	Given je suis sur la page de depot avec un <solde> dans mon compte
	When je remplis le champ avec un <montant>
	And je clique sur Deposer
	Then je devrais voir un message de depot effectue avec succes et le solde <attendue>

    Examples: 
      | solde  | montant | attendue  |
      | 10 |     100 | 110 |
      | 0 |     2000 | 2000    |
      
      
@retrait
Scenario Outline: retirer avec succes
	Given je suis sur la page de depot avec un <solde> dans mon compte
	When je remplis le champ avec un <montant>
	And je clique sur retire
	Then je devrais voir un message de retrait effectue avec succes et le solde <attendue>

    Examples: 
      | solde  | montant | attendue  |
      | 100 |     100 | 0 |
      | 50 |     10 | 40    |

