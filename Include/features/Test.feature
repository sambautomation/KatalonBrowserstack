Feature: Login

Scenario Outline: As a customer i can register on My store
    Given I can acess to the home page
    And I click on Connexion
    When I enter a login,password with <login>, <password>
    And I click on button to connect
    Then I can be successfully logged in on account <name> 

    @Test
    Examples: 
      | login                | password     |       name             |
      | merveille@agiltoo.fr | @Tester1234  |     Merveille Dos      |
      | ousseynou@agiltoo.fr | @Passer123   | Elhadji Ousseynou DIOP |