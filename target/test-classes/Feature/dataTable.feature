Feature:Login feature

  Background:

  Scenario Outline:Valid login
    Then User enters username and password from a table
      | Username | Password |
      | Bibhu    | Test     |
      | Prasad   | test123  |
      | Mishra   | test1234 |
      | Adyasha  | testing  |
    Then User clicks on submit and verifies home page "Dashboard" displayed
    Then User clicks something
      | Dataset1 | s1  | s2  | s3  | s4  | s5  |
      | Dataset2 | s11 | s21 | s31 | s41 | s51 |
    Then user clicks on home icons "<Icon1>" "<Icon2>" "<Icon3>"
    Then User clicks to use vertical DT
      | host  | port | db_name  |
      | local | 5432 | local_db |
      | Prod  | 1234 | PROD_db  |
      | Dev   | 2345 | Dev_db   |
      | Stage | 3456 | Stage_db |
    Then User clicks datattable
      | s1 | s11 |
      | s2 | s21 |
      | s3 | s31 |
      | s4 | s41 |
      | s5 | s51 |
    Then User gets Username and Password separately
      | UN  | PWD  |
      | UN1 | PWD1 |
      | UN2 | PWD2 |
      | UN3 | PWD3 |
      | UN4 | PWD4 |

    Examples:
      | Icon1 | Icon2    | Icon3 |
      | Home  | Navigate | Inbox |