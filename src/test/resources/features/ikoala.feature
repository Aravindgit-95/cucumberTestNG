Feature: verify the ikoala application

  Scenario Outline: To verify the search option
    Given User is on ikoala homepage
    When user search the products in search box "<products>"
    Then user clicks the Go button

    Examples: 
      | products    |
      | fashion     |
      | toys        |
      | mens shirts |
