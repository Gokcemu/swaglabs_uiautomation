Feature: Login

  Scenario: Login Functionality with valid credentials
    Given : User on Login Page
    When  : User set username as "standard_user" and password as "secret_sauce" fields
    And   : User click on login button
    Then  : User must navigates the Home Page