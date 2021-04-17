Scenario: I want to set person age and name
Meta: @person

Given person with name Eugen
When call client with name
Then verify person name Eugen and age 23