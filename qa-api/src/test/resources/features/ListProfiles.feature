@personalData
Feature: Users API

  @list_personal_001
  Scenario: Validate Get List Personal data
    Given I access the resource url "/employees"
    When I GET the results
    Then The status code should be 200