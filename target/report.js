$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Createexcel.feature");
formatter.feature({
  "name": "FlipkartElectronics",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@browse"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login and search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@browse"
    },
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "goto url \"https://www.flipkart.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.goto_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username \"udaya\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"1235322\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the login",
  "keyword": "But "
});
formatter.match({
  "location": "StepDefinition.close_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move to electronics section",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.move_to_electronics_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click electronics",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "use cursor to the one webelement",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.use_cursor_to_the_one_webelement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the webelement",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_the_webelement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "take text of all clicked elements",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.take_text_of_all_clicked_elements()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});