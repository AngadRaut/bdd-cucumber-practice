FeatureScenario: Amazon Search Functionality

  Scenario: Search for a product on Amazon
    Given I am on the Amazon homepage
    When I search for "laptop"
    Then I should see a list of laptops in the search results
    And the search results should contain at least 10 items
    And the first item should have a price displayed
