Feature: US1001 kullanıcı dogru bilgilerle database baglanabilmeli
  @db

  Scenario: TC01 kullanıcı database'deki bilgileri okur

    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur