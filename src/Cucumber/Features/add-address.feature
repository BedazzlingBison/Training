Feature: Add address feature

  Scenario Outline:
    Given the user on the account page, successfully logged in
    When Addresses button is clicked
    And Add New Address button is clicked
    And the Form is filled <aliasName> <companyName> <vatNumber> <addressDetails> <addressComplement> <cityName><zipCode><phoneNumber>
    And the Save Address Button ic clicked
    Then a "Address successfully added!" message is displayed


    Examples:
      | aliasName    | companyName   | vatNumber | addressDetails | addressComplement | cityName | zipCode | phoneNumber |
      | TestAddress1 | CodersLabTest | 1234      | Prosta 123     | Floor 5           | Warsaw   | 00-111  | 22123456    |

