Feature:Web Order Functionality

  Scenario: Positive Scenario on Search Bar
    Given user navigates to etsy webpage and searches for product
      | product | playstation 5 |
    Then  user picks any order and validates product title of it
      | title |Sony PlayStation 5 PS5 Slim Game Console in White Marvel's Spider-Man 2 Bundle - 1000039815|
    And user clicks on add to card button and enters zipcode
      | zipcode | 60056 |