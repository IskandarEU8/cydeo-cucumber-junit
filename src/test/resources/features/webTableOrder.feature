Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user select product type "Familybea"
    And user enters quantity 2
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "visa"
    And user enters credit card number "111122222333334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user select product type "<productType>"
    And user enters quantity <quantity>
    And user enters costumer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientist
    Examples: Famous female scientists
      | productType | quantity | customerName       | street     | city   | state   | zipCode | cardType | cardNumber    | expDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Marie Curie        |
      | Familybea   | 2        | Rosaline Franlin   | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Rosaline Franlin   |
      | Screenable  | 2        | List Meitner       | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | List Meitner       |
      | MoneyCog    | 2        | Chien-Shiung Wu    | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Chien-Shiung Wu    |
      | MoneyCog    | 2        | Barbara McClintock | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Barbara McClintock |

    @maleScientists @wip
    Examples: Famous male scientists
      | productType | quantity | customerName      | street     | city   | state   | zipCode | cardType | cardNumber    | expDate | expectedName       |
      | MoneyCog    | 2        | Albert Einstein   | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Albert Einstein     |
      | Familybea   | 2        | C. V. Raman       | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | C. V. Raman        |
      | Screenable  | 2        | Galileo Galilei   | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Galileo Galilei    |
      | MoneyCog    | 2        | Isaac Newton      | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Isaac Newton       |
      | MoneyCog    | 2        | Dmitriy Mendeleev | London str | London | England | 50505   | Visa     | 1111222335456 | 12/24   | Dmitriy Mendeleev |

