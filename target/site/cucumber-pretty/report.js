$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("kayak.feature");
formatter.feature({
  "line": 1,
  "name": "Kayak appication automation testcases",
  "description": "",
  "id": "kayak-appication-automation-testcases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search the flights",
  "description": "",
  "id": "kayak-appication-automation-testcases;search-the-flights",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the source city name",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Enter the destination city name",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on the calender",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search flights",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on particular flight in the flights list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "quitbrowser",
  "keyword": "Then "
});
formatter.match({
  "location": "kayakpagesteps.open_the_browser()"
});
formatter.result({
  "duration": 9006583000,
  "status": "passed"
});
formatter.match({
  "location": "kayakpagesteps.enter_the_source_city_name()"
});
formatter.result({
  "duration": 6487500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.kayak.stepDefinitionFile.kayakpagesteps.enter_the_source_city_name(kayakpagesteps.java:42)\r\n\tat ✽.Then Enter the source city name(kayak.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "kayakpagesteps.enter_the_destination_city_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "kayakpagesteps.click_on_the_calender()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "kayakpagesteps.click_on_search_flights()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "kayakpagesteps.click_on_particular_flight_in_the_flights_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "kayakpagesteps.quitbrowser()"
});
formatter.result({
  "status": "skipped"
});
});