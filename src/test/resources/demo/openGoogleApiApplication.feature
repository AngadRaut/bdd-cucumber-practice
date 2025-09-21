Feature: Google API availability check

  Scenario: Check Google homepage
    Given the API is available
    When I call the "/" endpoint
    Then the response should contain "Google"
