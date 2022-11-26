$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/uiFeatures/DragAndDrop.feature");
formatter.feature({
  "name": "This functionality validates Drag And Drop",
  "description": "",
  "keyword": "Feature",
  "tags": [
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
formatter.uri("file:src/test/resources/uiFeatures/DynamicContent.feature");
formatter.feature({
  "name": "This functionality validates scenario for dynamic content",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to  assert that the content changes on each refresh.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the dynamic content",
  "keyword": "Given "
});
formatter.match({
  "location": "DynamicContentSteps.user_navigates_to_the_dynamic_content()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts that the content changes on each refresh",
  "keyword": "And "
});
formatter.match({
  "location": "DynamicContentSteps.user_asserts_that_the_content_changes_on_each_refresh()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/JavaScriptError.feature");
formatter.feature({
  "name": "This feature file validates the functionality of JavaScript Error",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to validate page contains error",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the JavaScript error on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "JavaScriptErrorSteps.user_navigates_to_the_JavaScript_error_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts that the page contains error",
  "keyword": "Then "
});
formatter.match({
  "location": "JavaScriptErrorSteps.user_asserts_that_the_page_contains_error()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/NotificationMessage.feature");
formatter.feature({
  "name": "User validations for Notification Message functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to handle a Notification Message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Notification Message Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NotificationMessageSteps.user_navigates_to_Notification_Message_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Click Here link a multiple times",
  "keyword": "When "
});
formatter.match({
  "location": "NotificationMessageSteps.userClicksOnTheClickHereLinkAMultipleTimes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts that one of the message",
  "keyword": "And "
});
formatter.match({
  "location": "NotificationMessageSteps.userAssertsThatOneOfTheMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/RightClick.feature");
formatter.feature({
  "name": "This functionality validates scenarios for actionsRightClick Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to right click",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the page",
  "keyword": "Given "
});
formatter.match({
  "location": "RightClickPageSteps.user_navigates_to_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Right clicks on the box",
  "keyword": "When "
});
formatter.match({
  "location": "RightClickPageSteps.user_Right_clicks_on_the_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Say ok to alert",
  "keyword": "And "
});
formatter.match({
  "location": "RightClickPageSteps.user_Say_ok_to_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/alertPage.feature");
formatter.feature({
  "name": "User validations for Alerts functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should verify regular alert on Alerts Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Alert Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AlertPageSteps.user_navigates_to_Alert_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on JS JS Alert Button",
  "keyword": "When "
});
formatter.match({
  "location": "AlertPageSteps.user_clicks_on_JS_JS_Alert_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts alert message",
  "keyword": "Then "
});
formatter.match({
  "location": "AlertPageSteps.user_asserts_alert_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on JS confirm Button and clicks ok on alert",
  "keyword": "Then "
});
formatter.match({
  "location": "AlertPageSteps.user_clicks_on_JS_confirm_Button_and_clicks_ok_on_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts the alert message",
  "keyword": "And "
});
formatter.match({
  "location": "AlertPageSteps.user_asserts_the_alert_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on JS Prompt Button and types a message on Prompt",
  "keyword": "Then "
});
formatter.match({
  "location": "AlertPageSteps.user_clicks_on_JS_Prompt_Button_and_types_a_message_on_Prompt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts that the alert message contains the typed message",
  "keyword": "And "
});
formatter.match({
  "location": "AlertPageSteps.user_asserts_that_the_alert_message_contains_the_typed_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/checkUncheck.feature");
formatter.feature({
  "name": "This functionality validates scenario for check and uncheck",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to check and uncheck options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the check and uncheck page",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckUncheckSteps.user_navigates_to_the_check_and_uncheck_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks options",
  "keyword": "When "
});
formatter.match({
  "location": "CheckUncheckSteps.user_checks_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user unchecks options",
  "keyword": "And "
});
formatter.match({
  "location": "CheckUncheckSteps.user_unchecks_options()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/dropDown.feature");
formatter.feature({
  "name": "This functionality validates scenario for dropdown menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to select an option from the dropdown",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the dropdown page",
  "keyword": "Given "
});
formatter.match({
  "location": "DropdownSteps.user_navigates_to_the_dropdown_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Right clicks on dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "DropdownSteps.user_Right_clicks_on_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects an option from the dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "DropdownSteps.user_selects_an_option_from_the_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/dynamicControls.feature");
formatter.feature({
  "name": "This functionality validates scenario for dynamic controls",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to check dynamic controls",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the dynamic controls page",
  "keyword": "Given "
});
formatter.match({
  "location": "DynamicControlSteps.user_navigates_to_the_dynamic_controls_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Remove button",
  "keyword": "When "
});
formatter.match({
  "location": "DynamicControlSteps.user_clicks_on_Remove_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Enable button",
  "keyword": "Then "
});
formatter.match({
  "location": "DynamicControlSteps.user_clicks_Enable_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/dynamicLoading.feature");
formatter.feature({
  "name": "This functionality validates scenario for dynamic loading",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to check dynamic loading",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the dynamic loading page",
  "keyword": "Given "
});
formatter.match({
  "location": "DynamicLoadingSteps.user_navigates_to_the_dynamic_loading_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Start button",
  "keyword": "When "
});
formatter.match({
  "location": "DynamicLoadingSteps.user_clicks_on_Start_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies displayed message",
  "keyword": "Then "
});
formatter.match({
  "location": "DynamicLoadingSteps.user_verifies_displayed_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/fileDownload.feature");
formatter.feature({
  "name": "This feature  validates the functionality of File Download",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to download a document on  Download Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to  Download Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FileDownloadSteps.user_navigates_to_Download_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user downloads a document on  Download Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FileDownloadSteps.userDownloadsADocumentOnDownloadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/floatingMenu.feature");
formatter.feature({
  "name": "This functionality validates scenario for floating menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to check floating menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the floating menu page",
  "keyword": "Given "
});
formatter.match({
  "location": "FloatingMenuSteps.user_navigates_to_the_floating_menu_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrolls the page",
  "keyword": "When "
});
formatter.match({
  "location": "FloatingMenuSteps.user_scrolls_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "asserts that the floating menu is still displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FloatingMenuSteps.asserts_that_the_floating_menu_is_still_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/iFrame.feature");
formatter.feature({
  "name": "User validations for iFrames functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to enter a keyword into the text box on iFrames Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to iFrames page",
  "keyword": "Given "
});
formatter.match({
  "location": "iFramePageSteps.user_navigates_to_iFrames_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user switch to the frame",
  "keyword": "When "
});
formatter.match({
  "location": "iFramePageSteps.user_switch_to_the_frame()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types some text from into the frame",
  "keyword": "Then "
});
formatter.match({
  "location": "iFramePageSteps.user_types_some_text_from_into_the_frame()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the written text",
  "keyword": "And "
});
formatter.match({
  "location": "iFramePageSteps.user_verifies_the_written_text()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/loginPage.feature");
formatter.feature({
  "name": "User validations for Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login using valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"tomsmith\" username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"SuperSecretPassword!\" password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates successful login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_validates_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/loginPageFailure.feature");
formatter.feature({
  "name": "User validations for Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should not be able to login using invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsFailure.user_navigates_to_Loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"whatever\" Username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsFailure.user_enters_Username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"what\" Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsFailure.user_enters_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsFailure.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Your username is invalid!\" Error Message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsFailure.user_validates_Error_Message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/moveToElement.feature");
formatter.feature({
  "name": "This functionality validates scenarios for MoveToElement Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to hover over images",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to hover over page",
  "keyword": "Given "
});
formatter.match({
  "location": "MoveToElementPageSteps.user_navigates_to_hover_over_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hovers over on each image",
  "keyword": "When "
});
formatter.match({
  "location": "MoveToElementPageSteps.user_hovers_over_on_each_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that additional information is displayed for each image",
  "keyword": "Then "
});
formatter.match({
  "location": "MoveToElementPageSteps.user_verifies_that_additional_information_is_displayed_for_each_image()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/uploadFile.feature");
formatter.feature({
  "name": "This feature file validates the functionality of File Upload",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to upload an image File Upload Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to File Upload Page",
  "keyword": "Given "
});
formatter.match({
  "location": "UploadFileSteps.userNavigatesToFileUploadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user uploads a document on  File Upload Page",
  "keyword": "Then "
});
formatter.match({
  "location": "UploadFileSteps.userUploadsADocumentOnFileUploadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/windowsTaps.feature");
formatter.feature({
  "name": "User validations for Tabs and Windows functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to handle a new window",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Tabs and Windows Page",
  "keyword": "Given "
});
formatter.match({
  "location": "WindowsTapsPageSteps.user_navigates_to_Tabs_and_Windows_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Click Here link",
  "keyword": "When "
});
formatter.match({
  "location": "WindowsTapsPageSteps.userClicksOnTheClickHereLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts that a new tab is opened with text New Window",
  "keyword": "Then "
});
formatter.match({
  "location": "WindowsTapsPageSteps.userAssertsThatANewTabIsOpenedWithTextNewWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});