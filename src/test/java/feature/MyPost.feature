Feature: My Post
  Scenario: User Want To My Post Page
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    And Click My Post Image
    Then User Should be Directed to My Post Page

  Scenario: User Want To Like Post Page
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    And Click My Post Image
    And User Click Disukai
    Then User Should be Directed to Disukai Page

  Scenario: User Want To Click Dropdown Postingan in My Post Page
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    And Click My Post Image
    Then User Click Dropdown Postingan

  Scenario: User Want To Repost Post Page
    Given User go to Profiln Website
    When User Fill Valid Credential
    And User Click Login
    And Click My Post Image
    And User Click Repost
    Then User Should be Directed to Repost Page

