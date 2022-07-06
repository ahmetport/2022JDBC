Feature: US1003 kullanıcı DBUtil ile istenilen degeri test eder
Scenario: TC03 kullanıcı istenen degeri test edebilmeli


  Given kullanici DBUtils ile HMC veri tabanina baglanir
  And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
  And kullanici DBUutils ile "Price" sutunundaki verileri okur
  Then DBUtill ile 2. "Price" in 4000 oldugunu test eder