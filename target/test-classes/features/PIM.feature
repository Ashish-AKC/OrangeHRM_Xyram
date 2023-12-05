Feature: Employee configuration

Background: Launch Application
#Given I Login to application 

Scenario: Add Employee Process
Given I Login to application
When I click "PIM" menue
Then I see "PIM" on header
When I click "Add Employee" Tab
Then I see "Add Employee" page
When I enter first name "Sandeep" and last name "Reddy"
And I click "Save" button
Then I see "Successfully Save" toster message
And I see default as "Employee List" Tab
#And I enter drivers licence number "AYD72D5S3D" and expiry date "2024-11-11"
And I enter SSN number "8523697410"
And I select Nationality "Indian"
And I select gender "Male"
Then I save personal details


