Feature: Example feature

  Scenario: Login to the website
    Given I am on the login page
    When I enter my username and password
    And I click the login button
    Then I should be logged in

  Scenario: Logout to the website
    Given I am on the login page
    When I enter my username and password
    And I click the login button
    And I should be logged in
    And I click on the 3dotted bar
    And I click on the logout button
    Then I should be logged out