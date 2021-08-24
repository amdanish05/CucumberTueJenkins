Feature: Validating Adactin page.

Scenario Outline: Validating end to end functionalities with valid user name and valid password

Given  User is on Adactin home page
When User should enter "<username>" and "<password>"
And User should click login button

Examples:
|username|password|location|hotels|room_type|number_of_rooms|check_in_dates|check_out_dates|adult_per_room|children_per_room|first_name|last_name|address|credit_card_number|credit_card_type|credit_card_expiry_date|credit_card_expiry_year|CCV_number|
|mdanish05|N31YA2|Brisbane|Hotel Creek|Double|2 - Two|07/07/2021|10/10/2021|3 - Three|2 - Two|ani|md|INDIA|1478523697412583|American Express|April|2013|1478|
