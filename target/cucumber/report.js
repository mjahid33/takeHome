$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/uiFeatures/DragAndDrop.feature");
formatter.feature({
  "name": "This functionality validates Drag And Drop",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to Drag and Drop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to page",
  "keyword": "Given "
});
formatter.match({
  "location": "DragAndDropSteps.user_navigates_to_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Drags and drops corresponding boxes",
  "keyword": "Then "
});
formatter.match({
  "location": "DragAndDropSteps.user_Drags_and_drops_corresponding_boxes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});