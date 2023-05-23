Feature: Bank Test
  As a user I want to login into xyz bank website

  Background:
    Given I am on homepage

    @sanity
    Scenario: Bank manager should add customer successfully
      When I click on bank manager login tab
      And  I click on add customer tab
      And  I enter below details in customer page
      |John |Smith |xy27ct|
      Then I click on add customer button
      And  Popup displayed
      Then I can verify message "Customer added successfully"
      And  I click on ok button on pop up

  @smoke
  Scenario: Bank manager should open account successfully
      When I click on bank manager login tab
      And  I click on open account button
      And  I search customer that created in first test
      And  I select currency "Pound"
      And  I click on process button
      And  Popup displayed
      And  I am able to verify message "Account created successfully"
      Then I click on ok button on pop up

    @regression
    Scenario: Customer should login and logout successfully
      When I click on customer login tab
      And  I search customer that you created
      And  I click on login button
      And  I can verify "Logout" tab displayed
      And  I click on logout
      Then I am able to verify text "Your Name" displayed

  @regression
  Scenario: Customer should deposit money successfully
      When I click on customer login tab
      And  I search customer that you created
      And  I click on login button
      And  I click on deposit tab
      And  I enter amount 100
      And  I click on deposit button
      Then I should be able to verify message "Deposit Successful"

  @regression
  Scenario: Customer should withdraw money successfully
      When I click on customer login tab
      And  I search customer that you created
      And  I click on login button
      And  I click on deposit tab
      And  I enter amount 100
      And  I click on deposit button
      And  I click on withdrawal tab
      And  I enter amount 50 in customer login page
      And  I click on withdraw button
      Then I am able to verify message "Transaction Successful" on customer login page
