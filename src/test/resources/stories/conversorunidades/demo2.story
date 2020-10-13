Narrative:
In order to check Functionality
As an Tester
I want to verify whether a visa is required to visit the 

eta:@skip 
Scenarios:
Given I provide a nationality of 'Japan'
When I select the reason as 'Tourism'
When I submit the form
Then I will be informed I 'not need a visa' in the UK
