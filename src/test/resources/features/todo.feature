Feature: Registration

  Scenario: Success
    Given Navigate to basket page
    Given I have entered date of birth "28/11/1990"
    Given Fyller i förnamn "Simon"
    Given Fyller i efternamn "Mupp"
    Given Fyller i email "simon.mupp@mail.com"
    Given Upprepar email "simon.mupp@mail.com"
    Given Fyller i lösenord "Password1"
    Given Upprepar lösenord "Password1"
    Given Klickar i TaC
    Given Klickar i over 18
    Given Klickar i code of ethics
    When Klicka på registreringsknappen
    Then Verifiera "Your Basketball England Membership Number is" på sidan

  Scenario: Confirm last name missing
    Given Navigate to basket page
    Given I have entered date of birth "28/11/1990"
    Given Fyller i förnamn "Simon"
    Given Fyller i email "simon.mupp@mail.com"
    Given Upprepar email "simon.mupp@mail.com"
    Given Fyller i lösenord "Password1"
    Given Upprepar lösenord "Password1"
    Given Klickar i TaC
    Given Klickar i over 18
    Given Klickar i code of ethics
    When Klicka på registreringsknappen
    Then Verifiera errormeddelande "Last Name is required" på sidan

  Scenario: Confirm mail fail
    Given Navigate to basket page
    Given I have entered date of birth "28/11/1990"
    Given Fyller i förnamn "Simon"
    Given Fyller i efternamn "Mupp"
    Given Fyller i email "simon.mupp@mail.com"
    Given Upprepar email "simon.mupp@mail"
    Given Fyller i lösenord "Password1"
    Given Upprepar lösenord "Password1"
    Given Klickar i TaC
    Given Klickar i over 18
    Given Klickar i code of ethics
    When Klicka på registreringsknappen
    Then Verifiera felmeddelande "Confirm Email Address does not match" på sidan

  Scenario: Confirm no TaC
    Given Navigate to basket page
    Given I have entered date of birth "28/11/1990"
    Given Fyller i förnamn "Simon"
    Given Fyller i efternamn "Mupp"
    Given Fyller i email "simon.mupp@mail.com"
    Given Upprepar email "simon.mupp@mail.com"
    Given Fyller i lösenord "Password1"
    Given Upprepar lösenord "Password1"
    Given Klickar i over 18
    Given Klickar i code of ethics
    When Klicka på registreringsknappen
    Then Verifiera rödtext "You must confirm that you have read and accepted our Terms and Conditions" på sidan



