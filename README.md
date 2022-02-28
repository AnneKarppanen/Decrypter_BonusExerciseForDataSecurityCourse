Frekvenssianalyysiä hyödyntävä ohjelma salakirjoituksen murtamiseen (Bonustehtävä Tietoturva-kurssille kevät 2021)

Ohjelma koostuu kahdesta osasta: pääohjelmasta ja Merkki-luokasta. 
Kun ohjelma käynnistetään, se pyytää käyttäjää syöttämään murrettavan tekstin. 
Ohjelma tallentaa syötetyn tekstin merkkijonoksi. Tämän jälkeen se luo jokaisesta 
erilaisesta tekstistä löytyvästä merkistä Merkki-olion. 
Poikkeuksen muodostavat välilyönnit, joista ei luoda oliota. 
Merkki-olioilla on neljä jäsenmuuttujaa: merkki, merkitys, maara ja frekvenssi. 
Ohjelma tallettaa Merkki-oliot ArrayList-rakenteeseen.

Ohjelma laskee jokaisen merkin määrän syötetystä tekstistä ja tallentaa sen 
kyseisen olion jäsenmuuttujaan. Ohjelma tallentaa jokaisen merkin “merkitykseksi” aluksi kyseisen merkin. 
Tämän jälkeen ohjelma laskee kunkin merkin frekvenssin annetussa tekstissä ja tallentaa myös sen jäsenmuuttujaan. 
Sen jälkeen ohjelma järjestää Merkki-olioita sisältävän ArrayListin frekvenssien mukaan ja tulostaa listan merkit,
niiden määrät ja frekvenssit. 

Varsinaisen tekstin murtamiseen käytetään while-toistorakennetta, jota toistetaan niin kauan kunnes käyttäjä 
valitsee, ettei halua enää jatkaa. Toistorakenteessa ohjelma kysyy käyttäjältä, minkä merkin hän haluaa korvata 
toisella merkillä. Kun käyttäjä valitsee merkin, ohjelma tulostaa merkin frekvenssin ja ne suomen kielen kirjaimet,
joiden frekvenssit eroavat korkeintaan 2,5 % siitä. Suomen kielen merkkien frekvenssit on tallennettu ohjelmaan 
HashMap-rakenteeseen, mistä ohjelma hakee ja tulostaa aina ehdon täyttävät frekvenssit. 
Tämän jälkeen ohjelma kysyy, millä merkillä valittu merkki korvataan. 
Ohjelma tallentaa valitun merkin alkuperäisen tekstin merkin merkitykseksi ja tulostaa tekstin niin, 
että kustakin merkistä tulostetaan sille tallennettu merkitys. 

Jos käyttäjä ei ole syöttänyt jollekin merkille uutta merkitystä, tulostuu sen merkityksenä alkuperäinen merkki. 
Tulostuksen jälkeen ohjelma kysyy, haluaako käyttäjä jatkaa murtamista. 
Jos käyttäjä haluaa jatkaa, pyydetään häneltä seuraava korvattava merkki.  

Ohjelma olettaa, että käyttäjällä on tallessa alkuperäinen murrettava teksti, josta hän voi tarkistaa alkuperäiset
merkit. Käyttäjä voi muuttaa merkkien merkityksiä useampaan kertaan, mutta ohjelman kysyessä, minkä merkin hän 
haluaa korvata, hänen tulee käyttää merkin alkuperäistä muotoa. Murtamista helpottaa, jos murrettava teksti 
syötetään eri kirjaimistolla kuin murretut kirjaimet (esim. isot ja pienet kirjaimet). Näin on helpompi hahmottaa,
mitkä kirjaimet on jo murrettu.  

Ratkaisuni auttaa käyttäjää salakirjoituksen murtamisessa laskemalla murrettavan tekstin merkkien määrät ja 
frekvenssit ja tarjoamalla mahdollisia vastaavia kirjaimia. Ohjelma auttaa käyttäjää myös testaamaan, miten 
valitut vastaavuudet toimivat tekstin tasolla. Käyttäjä voi itse valita, mistä merkeistä hän aloittaa murtamisen. 
Näin käyttäjä voi aluksi keskittyä esimerkiksi tekstin lyhyempiin sanoihin, jotka ovat usein pitkiä helpompia 
murtaa. Koska kirjainten frekvenssit vaihtelevat jonkin verran tekstistä toiseen, ohjelma ei voi korvata kirjaimia 
automaattisesti, vaan tähän tarvitaan käyttäjän harkintaa ja päättelyä. 

Voisin hioa ohjelmaa edelleen esimerkiksi lisäämällä syötteiden tarkistukset ja monipuolistamalla käyttäjän 
valikkoa. Käyttäjä voisi esimerkiksi pystyä tulostamaan myös eri merkeille tallennetut merkitykset. 
Ohjelma voisi myös tallettaa syötetyn tekstin automaattisesti isoina kirjaimina ja merkitykset pieninä kirjaimina 
käytön selkeyttämiseksi. Tässä versiossa vastuu näistä asioista jää kuitenkin käyttäjälle.  

