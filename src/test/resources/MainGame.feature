Feature: Users can start and forfeit games

  Scenario:
    Given The user is on the log in page
    And The user inputs their username
    And The user inputs their password
    And The user presses log in
    When The user presses new game
    And The user inputs the ID of another player
    And The user presses start game
    Then The title should say the player names

  Scenario:
    Given The user is on the log in page
    And The user inputs their username
    And The user inputs their password
    And The user presses log in
    When The user presses forfeit
    Then An alert will say you lost