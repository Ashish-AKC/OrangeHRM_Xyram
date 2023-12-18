@Timesheet @regression @smoke
Feature: Time Sheet Module

Background: Launch Application
#Given I Login to application

Scenario: Employee able to enter time sheet
Given I Login to application
When I click "PIM" menue
Then I see "PIM" on header
When I click "Add Employee" Tab
Then I see "Add Employee" page
When I enter first name "Sandeep" and last name "Reddy"
And I enable create login details toggle button
Then I see username,password,confirm password,status fields
When I enter username "Sandeep Reddy"
And I enter password "1234567890a"
And I enter confirm password "1234567890a"
And I click "Save" button
Then I see "Successfully Save" toster message
And I see default as "Employee List" Tab
When I click profile
#Then I see "About","Supprot","Change Password","Logout"
When I click "Logout" button on profile
Then I see login page
When I login to user application "Sandeep Reddy","1234567890a"
Then I see dashboard page
#Then I verify Time sheet card in dashboard page
When I click "Time" menue
#Then I see "Timesheets" on header
#And I verify time sheet page
And I click "Edit" button 
Then I see "Type for hints..." text box
And I see "Activity" dropdown
When I select "Internal" project
And I select "Shortlisting Candidates" in activity dropdown
And I enter time sheet "Tue" day working "8" hrs
Then I click "Save" button 


