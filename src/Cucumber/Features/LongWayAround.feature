Feature: Login and adding a new address

  Scenario Outline:
    Given user is on the main page
    When signin button is clicked
    And user logs into their account
    And addresses button is clicked
    And add new address button is clicked
    And address form is filled with <aliasInput> <companyName> <addressVatInput> <addressAddressInput> <addressAddressComplementInput> <cityInput> <zipCode> <phoneNumber>
   #    And save new address button is clicked
#    Then a success message is displayed

    Examples:
      | aliasInput   | companyName   | addressVatInput | addressAddressInput | addressAddressComplementInput | cityInput | zipCode | phoneNumber |
      | TestAddress1 | CodersLabTest |1234             |Prosta 123           |Floor 5                        |Warsaw     |00111    |22123456     |