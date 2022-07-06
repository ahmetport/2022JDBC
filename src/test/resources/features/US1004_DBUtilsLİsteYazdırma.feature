Feature: US1004 kullanıcı istenen tablodaki istenen field' i listeleyebilir

  Scenario: TC04 KULLANICI FİELD LİSTESİ YAZDIRABİLMELİ

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundaki "Price" verilerini alir
    And kullanici DBUutils ile "Price" sutunundaki verileri okur
    And DBUtil ile tum "Price" degerlerini sira numarasi ile yazdirir