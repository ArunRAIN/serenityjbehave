Narrative:
In order to check Functionality
As an Tester
I want to verify whether a visa is required to visit the UK

eta:@skip 
Scenarios:
Given I provide a nationality of 'Japan'
When I select the reason 'Study'
When I state I am intending to stay for more than '6months'
When I submit the form
Then I will be informed I 'need a visa to study' in the UK