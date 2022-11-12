
@Google
Feature: US001 Google Search
  Scenario: TC01 user trendyol da makas aratir

    Given  user google gider
    Then user trendyolu aratir
    And user trendyola gider
    And user makas aratir
    And toplam urun sayisini alir
    And yeni sekmede morhipo gider
    And user morhipoda makas aratir
    And toplam makas sayisini alir
    Then iki sitedeki topla makas sayısını karşılaştırınız
    And once ürün sayısı fazla olan siteyi kapatınız
    Then Sonra diğer sayfayıda kapatınız