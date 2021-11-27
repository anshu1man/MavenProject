$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/GoogleSearch.feature");
formatter.feature({
  "name": "Check The Search Functionality at Google Search Engine",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check if User is able Search Successfully at Google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchStep.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open a Google Search Engine",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchStep.open_a_Google_Search_Engine()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Text to be Searched",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchStep.user_enters_the_Text_to_be_Searched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchStep.user_clicks_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Successfully navigate to",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchStep.user_Successfully_navigate_to()"
});
formatter.result({
  "status": "passed"
});
});