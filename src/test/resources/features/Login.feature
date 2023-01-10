Feature: test



@test
  Scenario: E2E ödeme senaryosu
Given Kullanıcı standat user ile siteye login olur "standard_user" password "secret_sauce"
And   Kullanıcı 4 ürünü sepete ekler
And   Kullanıcı sepet iconunu tıklar
And   Kullanıcı ana sayfada gelen ürünün fiyatının buradakiyle aynı olduğunu görür
And   Kullanıcı checkOut butonunu tıklar
And   Information page üzerinde isim alanına "Joel" soyisim alanına "Miller" posta kodu alnına "0600" girer ve Continue butonunu tıklar
And   Item total tutarının ana sayfada görülen turarla aynı olduğu görülür
When  Kullanıcı Finish butonunu tıklar
Then  Kullanıcı "THANK YOU FOR YOUR ORDER" ikazını görür



