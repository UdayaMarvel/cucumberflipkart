@browse
Feature:FlipkartElectronics
Background:
Given Launch browser

@Search
Scenario: Login and search
Given goto url "https://www.flipkart.com"
Then enter username "udaya"
Then enter password "1235322"
When click login button
But close the login
Then move to electronics section
Then click electronics 
And use cursor to the one webelement
When click the webelement
And take text of all clicked elements
