Feature: Login to Amazon website
  Scenario Outline: Amazon Home page navigation
    When User is in Amazon Home page verify Account login displays
    Then User tries to login with valid credentials
    #And User scrolls browser window
    #Then User selects all the options matching from table
    #|DropDownlist|
    #|All Categories|
    #|Alexa Skills|
    #|Amazon Devices|
    #|Amazon Fashion|
    #|Amazon Fresh|
    #|Amazon Fresh Meat|
    #|Amazon Pharmacy|
    #|Appliances|
    #|Apps & Games|
    #|Audible Audiobooks|
    #|Baby|
    #|Beauty|
    #|Books|
    #|Car & Motorbike|
    #|Clothing & Accessories|
    #|Collectibles|
    #|Computers & Accessories|
    #|Deals|
    #|Electronics|
    #|Furniture|
    #|Garden & Outdoors|
    #|Gift Cards|
    #|Grocery & Gourmet Foods|
    #|Health & Personal Care|
    #|Home & Kitchen|
    #|Industrial & Scientific|
    #|Jewellery|
    #|Kindle Store|
    #|Luggage & Bags|
    #|Luxury Beauty|
    #|Movies & TV Shows|
    #|MP3 Music|
    #|Music|
    #|Musical Instruments|
    #|Office Products|
    #|Pet Supplies|
    #|Prime Video|
    #|Shoes & Handbags|
    #|Software|
    #|Sports, Fitness & Outdoors|
    #|Subscribe & Save|
    #|Tools & Home Improvement|
    #|Toys & Games|
    #|Under ₹500|
    #|Video Games|
    #|Watches|
    #Then User selects from dropdown to search item "<filteroption>"
    When User clicks home logo to return to Home page
    Then User logs out

    Examples:
    |filteroption|
    |Amazon Fresh|