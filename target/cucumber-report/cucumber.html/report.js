$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/test/lameertha/resources/featurefile/order.feature");
formatter.feature({
  "line": 1,
  "name": "Ordering T-Shirt",
  "description": "As a user I want order T shirt from automation practice website",
  "id": "ordering-t-shirt",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10987137700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to order T-Shirt successfully",
  "description": "",
  "id": "ordering-t-shirt;user-should-able-to-order-t-shirt-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on T-Shirt Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Select T-Shirt",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on to t-shirt image",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be able to see T-Shirt added to cart sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 179077600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTShirtTab()"
});
formatter.result({
  "duration": 6095477000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectTShirt()"
});
formatter.result({
  "duration": 2598330800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnToTShirtImage()"
});
formatter.result({
  "duration": 197755000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 138027700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToSeeTShirtAddedToCartSucessfully()"
});
formatter.result({
  "duration": 5062656900,
  "status": "passed"
});
formatter.after({
  "duration": 871121900,
  "status": "passed"
});
formatter.uri("src/test/java/com/test/lameertha/resources/featurefile/updateinfo.feature");
formatter.feature({
  "line": 1,
  "name": "Update Personal Information Functionality",
  "description": "As a user I want to Update Personal Information (First Name) in My Account",
  "id": "update-personal-information-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9054628000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able To Update Personal Information (FirstName) page successfully",
  "description": "",
  "id": "update-personal-information-functionality;user-should-able-to-update-personal-information-(firstname)-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Sign In Button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter the EmailAddress \"lameertha11@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the Password \"Lamee1988\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I SingIn Button2",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Personal Information Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Updating My First Name \"LAMEE\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter the old password \"Lamee1988\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click the Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should able to see the Update Personal Information (First Name) page successfully \"LAMEE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs3.iAmOnHomePage()"
});
formatter.result({
  "duration": 17978700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs3.iClickOnSignInButton()"
});
formatter.result({
  "duration": 4934106700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lameertha11@gmail.com",
      "offset": 26
    }
  ],
  "location": "MyStepdefs3.iEnterTheEmailAddress(String)"
});
formatter.result({
  "duration": 696440000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lamee1988",
      "offset": 22
    }
  ],
  "location": "MyStepdefs3.iEnterThePassword(String)"
});
formatter.result({
  "duration": 294690200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "MyStepdefs3.iSingInButton(int)"
});
formatter.result({
  "duration": 12348342100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs3.clickOnThePersonalInformationButton()"
});
formatter.result({
  "duration": 12118040800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAMEE",
      "offset": 24
    }
  ],
  "location": "MyStepdefs3.updatingMyFirstName(String)"
});
formatter.result({
  "duration": 224981200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lamee1988",
      "offset": 24
    }
  ],
  "location": "MyStepdefs3.enterTheOldPassword(String)"
});
formatter.result({
  "duration": 239394100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs3.clickTheSaveButton()"
});
formatter.result({
  "duration": 11541576700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAMEE",
      "offset": 85
    }
  ],
  "location": "MyStepdefs3.iShouldAbleToSeeTheUpdatePersonalInformationFirstNamePageSuccessfully(String)"
});
formatter.result({
  "duration": 71752000,
  "status": "passed"
});
formatter.after({
  "duration": 2233456000,
  "status": "passed"
});
});