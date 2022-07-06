Feature: US1005 kullanıcı update yapabilmeli

  Scenario: TC04 kullanıcı update yapabilmeli

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    Then tHOTEL tablosunda IDHotel degeri 1016 olan kaydin Email bilgisini "sizOldunuz@gmail.com" yapar