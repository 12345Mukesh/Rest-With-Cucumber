Feature:  Get all products from api
  Scenario: Verify getapi for products
    Given I hit url of get products api endpoint
    When I pass the url of products in request
    Then I receive the response code as 200

  Scenario Outline: Verify the rate of first product is correct
    Given I hit url of get products api endpoint
    When I pass the url of products in request
    Then I verify that the rate of first product is <FirstProductRate>

    Examples:
      |FirstProductRate |
      | 3.9             |