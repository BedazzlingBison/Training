Feature: Login and adding a new address

  Scenario Outline:
    Given user is on the main page
    When signin button is clicked
    And user logs into their account
    And addresses button is clicked
    And add new address button is clicked
    And address form is filled with <aliasName> <companyName> <vatNumber> <addressDetails> <addressComplement> <cityName><zipCode><phoneNumber>
#    And save new address button is clicked
    Then a success message is displayed

    Examples:
      | aliasName    | companyName   | vatNumber | addressDetails | addressComplement | cityName | zipCode | phoneNumber |
      | TestAddress1 | CodersLabTest | 1234      | Prosta 123     | Floor 5           | Warsaw   | 00-111  | 22123456    |

