Feature: US1002 kullanıcı DB UTİLS ile database baglantısı yapabilir
@DBUtils
  Scenario:TC02 kullanıcı DB utils ile databasedeki verileri okur

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile"tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUutils ile "Price" sutunundaki verileri okur