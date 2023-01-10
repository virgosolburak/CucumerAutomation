Feature: Login




  Scenario: Valid Login
    Given kullanici username "standard_user" girer
    And   kullanici password "secret_sauce" girer
    When  kullanici login butonunu tikladiginda
    Then  kullanici login olabilmelidir

  @wip0409
    Scenario: login declarative
      Given Kullanici "standard_user" username "secret_sauce" password ile login olur

    @wip04092
    Scenario: sepete urun ekleme cikarma
      Given Kullanici "standard_user" username "secret_sauce" password ile login olur
      And   Kullanici cantayi sepete ekler
      And   Kullanici basket iconu tiklar
      When  kullanici urunu kaldırır
      And   kullanici ana sayfaya gider
      Then  urunun kaldirildigini gorur



