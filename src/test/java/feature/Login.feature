Feature: Login Feature

  Scenario: User Login Use a Unregistered Google Account
    Given User go to Profiln Website
    When User Klik Login Using Google
    Then User Fill Registered Account Google

  Scenario: User Login With Valid Credential
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    Then User Should be Directed to Homepage

  Scenario: User Login With Invalid Credential
    Given User go to Profiln Website
    When User Fill Invalid Credential
    And User Click Login
    Then User Should be get Notification that Email atau Password Salah

  Scenario: User Login With Empty Field Email
    Given User go to Profiln Website
    When User Fill Password Only
    Then The Login Button Remains Disabled
    And User Should be get Notification Error For Email

  Scenario: User Login With Empty Field Password
    Given User go to Profiln Website
    When User Fill Email Only
    Then The Login Button Remains Disabled
    And User Should be get Notification Error For Password

  Scenario: User Want To Unhide Password
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Klik Eye Icon
    Then User Can Unhide Password

  Scenario: User Want To Hide Password
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Klik Eye Iconn
    Then User Can Hide Password

  Scenario: User Login With input <8 karakter Password
    Given User go to Profiln Website
    When User Fill User Fill Kurang Dari 8 karakter Password
    Then User Should be get Notification Error For Password

  Scenario: User Check box " Remember Me ?"
    Given User go to Profiln Website
    When User Checked Remember Me? box
    Then The Remember Me Box Is Successfully Checked

  Scenario: User Uncheck box " Remember Me ?"
    Given User go to Profiln Website
    When User Checked Remember Me? boxx
    Then The Remember Me Box Is Successfully Uncheck

  Scenario: User Login By Entering Password Without Any Spesial Characters
    Given User go to Profiln Website
    When User Fill Password Without Any Spesial Characters
    Then User Should be get Notification Error For Password

  Scenario: User Login By Entering Password Without Any Uppercase
    Given User go to Profiln Website
    When User Fill Password Without Any Uppercase
    Then User Should be get Notification Error For Password

  Scenario: User Click Forget Password
    Given User go to Profiln Website
    When User Klik Forgot Password
    Then User Should be Directed to Forgot Password Page

  Scenario: User Click Daftar Di Sini
    Given User go to Profiln Website
    When User Klik Register now in haven't chosen an account yet?
    Then User Should be Directed to Registration Page

  Scenario: User Login By Entering Email Without Correct Email Format
    Given User go to Profiln Website
    When User Fill Email Without Correct Email Format
    Then User Should be get Notification Error For Email

  Scenario: User Login With input <10 karakter Email
    Given User go to Profiln Website
    When User Fill User Fill Kurang Dari 10 karakter Email
    Then User Should be get Notification Error For Email

  Scenario: User Want to Logout After Login
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    And User Klik Icon Profile
    Then User Klik Logout
