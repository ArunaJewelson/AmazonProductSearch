Feature: Validation of Samsung phones in amazon web application

Scenario: To verify whether system allows the user to navigate to the phone & Accessories page
Given User is on the Amazon homepage
When User click on AllIcon
When User navigate to Electronics and Computer > Phone and Accessories
Then User should see the "Phones & Accessories" page displayed

Scenario: To verify whether system allows the user to navigate to the SIM-Free & Unlocked Mobile Phones page
Given User is on the phone accessories page
When User click on SIM-Free under mobile phones section
Then User should see the page "SIM-Free & Unlocked Mobile Phones" displayed

Scenario: To verify whether system allows the user to list the samsung phone with specific specification
Given User is on the SIM-Free & Unlocked Mobile Phones page
When User click on Samsung under brands section
And User click on Camera Resolution as "20" mp and above
And User click on Model Year as "2023"
And User should check whether the phone exists between 50 to 100
Then User should see the "samsung" phone listed with the match criteria as 50 to 100