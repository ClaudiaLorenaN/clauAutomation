Feature: Login functionality
  Background:
    Given I am the main page
    When I am in the login page

  @SmokeTest
  Scenario: TC-001 Successfully login
    And Type my user and my pass for test "TC-001"
    Then The main page should be open

  Scenario: TC-002 unsuccessfully login (both no valid user and password)
    And Type the user user and the pass password for test "TC-002"
    Then The system should show an error

  Scenario: TC-003 unsuccessfully login (valid user and password field empty)
    And Type my password password for test "TC-003"
    Then The system should masked it

  Scenario: TC-004 unsuccessfully login (user field empty and valid password )
    And Type my password password for test "TC-004"
    Then The system should masked it

  Scenario: TC-005 unsuccessfully login (both empty user and password fields)
    And Click on Sign out
    And Click on back button
    Then should redirect to login page