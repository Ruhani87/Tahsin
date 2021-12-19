Feature: Login


Scenario: verify user login

Given Launch url
Then Enter user name
Then Enter user password
When Click log in button
Then Verify user can log in
