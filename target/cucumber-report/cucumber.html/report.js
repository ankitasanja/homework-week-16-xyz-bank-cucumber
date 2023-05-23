$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bank.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "As a user I want to login into xyz bank website",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5069172401,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BankSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 85312801,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Customer should withdraw money successfully",
  "description": "",
  "id": "bank-test;customer-should-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "I click on customer login tab",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I search customer that you created",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on deposit tab",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I enter amount 100",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click on deposit button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I click on withdrawal tab",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I enter amount 50 in customer login page",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I click on withdraw button",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I am able to verify message \"Transaction Successful\" on customer login page",
  "keyword": "Then "
});
formatter.match({
  "location": "BankSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 491801699,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iSearchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 2261445400,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 66942099,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnDepositTab()"
});
formatter.result({
  "duration": 912092200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 15
    }
  ],
  "location": "BankSteps.iEnterAmount(int)"
});
formatter.result({
  "duration": 429718300,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnDepositButton()"
});
formatter.result({
  "duration": 2092930700,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnWithdrawalTab()"
});
formatter.result({
  "duration": 2104374000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 15
    }
  ],
  "location": "BankSteps.iEnterAmountInCustomerLoginPage(int)"
});
formatter.result({
  "duration": 2105249299,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnWithdrawButton()"
});
formatter.result({
  "duration": 2100190400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction Successful",
      "offset": 29
    }
  ],
  "location": "BankSteps.iAmAbleToVerifyMessageOnCustomerLoginPage(String)"
});
formatter.result({
  "duration": 2049070001,
  "status": "passed"
});
formatter.after({
  "duration": 704956500,
  "status": "passed"
});
});