## M10 Arv
Læringsmålet er nådd når du kan forklare begrepet arv, og bruke arv til å forbedre strukturen på egne programmer

Arv en viktig funksjon som tilhører objekt-orienterte programmeringspråk som Java. Arv gjør at klasser kan arve egenskaper fra andre klasser. Disse egenskapene kan være felter, metoder og variabler.

[ Hent fram Modul10 -> network-v1 ]
I et eksempel fra boka, ble det laget en enkel prototype av en sosialnettverksplattform der man hadde tre klasser, NewsFeed, MessagePost og Photopost. Kodeinnholdet i MessagePost og PhotoPost var nesten helt like men noen få unntak. Ved å refaktorere koden kunne man ta i bruk arv og lage en superklasse som inneholder all koden de MessagePost og PhotoPost hadde til felles, og så la de arve felleskoden.

[Hent fram Modul10 -> network-v2]
Snakk litt om mer om koden i network 2

### Advantages of inheritance
Ved å ta i bruk arv kan man redusere mengden med Code Duplication. Dette har en mengde med fordeler.

* Unngå kodeduplisering
Bruk av arv unngår behovet for å skrive identiske eller svært like kopier av kode to ganger (eller enda oftere).

* Gjenbruk av kode
Eksisterende kode kan gjenbrukes. Hvis en klasse som ligner på den vi trenger allerede eksisterer, kan vi noen ganger gjenbruke noe av den eksisterende koden, i stedet for å måtte implementere alt på nytt.

* Enklere vedlikehold
Å vedlikeholde applikasjonen blir lettere, fordi det blir mindre kodeduplisering. Noe som gjør at man ikke trenger å ertsatte samme linje med kode om og om igjen, hvis man skal gjøre noen endriner. En endring i et felt eller en metode som er delt mellom ulike typer underklasser, må bare gjøres én gang.
* Utvidbarhet
Ved å bruke arv blir det mye lettere å utvide en eksisterende applikasjon siden man har et bedre utgangspunkt å jobba ut ifra.

[ Hent fram Modul10 -> network-v1 ]
Hvis jeg for eksempel skulle lage en ny klasse til denne porototypen av en sosial medie platform. Så kunne jeg for eksempel lage en klasse som heter EventPost. Denne klassen vil ha ansvar for poster som Anders har opdatert profilbildet sit osv. Hvis jeg skulle lagt til denne klassen i versjon 1 av dette prosjektet så måtte jeg ha skrevet all koden på nytt, inkludert koden som PhotoPost og MessagePost allerede har som duplikat. Jeg måtte også ha lagt til addEventPost i NewsFeed og en for loop for å vise eventPosten i NewsFeed. Så for hver klasse måtte jeg ha skrevet mer og mer duplikatkode, og tenk om jeg skal gjøre en felles endring, da måtte jeg ha manuelt skrevet om hver eneste klasse.

[Hent fram Modul10 -> network-v2]
Hvis vi går tilbake til versjon 2 så kan vi se at det blir mye enklere å legge til en ny klasse. Jeg hadde bare trengt å skrive ca. like lite som det er i MessagePost. 
```Java
public class EventPost extends Post
{
    public String eventType;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String author, String eventType)
    {
        super(author);
        this.eventType = eventType;
        
    }

     /**
     * Return the event type in this post.
     * 
     * @return The post's event type.
     */
    public String getEventType()
    {
        return eventType;
    }
}
```

Jeg kunne konsentrert meg bare om de nye egenskapene unikt til EventPost, som eventType. siden alle fellestingene blir automatisk arvet fra Post, som like og unlilke.

## M10 Klassehierarki
Du har nådd dette læringsmålet når du kan forklare begrepene subklasse, superklasse og klassehierarki

Superclass og subclass (eller parent class og child class) som det også går an å si er det motsatte av hverandre når det kommer til arv i objektorienterte programmeringsspråk. Subklassene er klasser som arver egenskaper fra en superklasse. Så i dette tilfelle her med den sosiale medie platformen, så er post en superklasse og MessagePost, PhotoPost og EventPost som vi nettop lagde en subklasse av post.

Klassehierearki er måtn de forskjellige klassene i et prosjekt er koblet smamen til hverandre gjennom arv. I BlueJ blir dette representert grafisk med blanke piler. Hvis jeg fjerner extends beteigningen til EventPost da kan vi se at pilen forsvinner. Det betyr at EventPost ikke lenger arver noen egenskaper fra Post, og er derfor ikke lenger en subklasse.

## M10 Klassen Object
Du har nådd læringsmålet når du kjenner til klassen Object, og kan forklare hvilken rolle den spiller i arv.

Hitil nå i det jeg har forklart kan det se ut som at klasser som ikke arver fra noen klasser, ikke har en superklasse men dette er faktisk feil, fordi alle klasser i Java har en standard klasse som de alltid arver egenskaper fra. Denne klassen blir kalt for objectklassen. Dette er fordi java naturligvis er et objektbasert programmeringspråk. Object klassen kommer fra Java Standard Library og er derfor alltid automatisk i alle java prosjekter.

Og så hvis vi skriver:
```java
public class Person{

}

// Så blir det det samme som å skrive

public class Person extends Object{

}
```
Men det trenger vi heldigvis ikke å skrive sien java kompilatoren autoamtisk legger inn objektk superklasen for alle klasser som ikke har extend deklarasjonen som viser til en annen superklasse. Og litt mer om hvilken rolle den spiller i arv, så er det at den sørger for at klasser for tilgang til metoder som .equals og .toString siden de er en del av den superklassen.

Så for å oppsummere så er object klassen en standard klasse som java kompilatoren automatisk setter på alle klasser som ikke allerede viser til en annen superklasse.

## M10 Polymorfe Metoder
Du har nådd læringsmålet når du kan forklare begrepet polymorfisme, og vise eksempler på bruk av polymorfe metoder i egen kode eller i eksempler fra boka

Så ordet Polyformiste betyr mange former. Og Polymorfisme i java betyr mange former av den samme metoden. Så formålet med ppolyformisme det er at forskjellige subklasser kan ta i bruk samme metode, og også kunne gjøre endringer på metodene slik at de passer til rollen de har. Når en subklasse arver egenskaper fra en superklasse kan den ta i bruk metoder som hører til den superklassen eller et objekt av den superklassen og så endre hva metoden gjør. Polyformisme gjør også da at subklassen kan ha en metode med samme navn som superklassen. og siden subklassen også arver denne metoden så går det faktisk ann at en subklasse teknisk sett kan ha to metoder med samme navn. Jeg skal vise til et eksempel på det nå i en egen kode jeg lagde i stad, det er ikke noe særlig stor avansert kode men jeg mener på at det får fram poenget.

[ Dra fram modul10 -> Test ]
Så her har jeg et par klasser, og man kan da se fra de pilene at vi har arv på gang. Så øverst så har vi da den øverste superklassen, eller teknisk sett den nest øverste for igjen så vil jo denne arve object klassen som vi gikk gjennom i stad. Men her har jeg da satt opp to variabler boolean lagerLyd og int gjennomsnittsvekt og så har jeg også en metode som heter spillMusikk.

Så her kan vi se på det ene seksemple med polyformisme
[Forklar spillMusikk i Instrument klassen og i Trommer klassen]
[vis til spillMusikk i Fiolin klassen og snakk om at det går ann selv med en mellomting]
[Lag en ny klasse som du kaller for Fløyte. HUSK Å ENDRE NAVN I SELVE KODEN TIL FLØYTE OG FJERN EXTEND]

[Snakk om protected boolean og int i Instrument og det samme i Strengeinstrument]
Protected
Urelaterte klasser vil ikke ha tilgang til variablene med protected på seg, men klasser som arver vil fortsatt ha tilgang til det
ligner på private bortsett fra at den gir tilgang til klasser som er extenda
jeg ha rnøkkelen til huset til pappa men ikke har nøkkelen til huset til naboen. Siden jeg liksom har arvet nøkkelen til pappa

[Snakk om å refaktorere koden i fiolin og gitar og snakk om kodeduplikasjon.]
[ Fjern visDetaljer metode fra Fiolin og legg den i StrengeInstrument]
[ Legg til visDetaljer() i spillMusikk i fiolin]


## M10 Typehierarki
Læringsmålet er nådd når du kan forklare begrepene subtype og typehierarki, og sammenhengen mellom typehierarki og klassehierarki


superklassen definerer typen og alle subklasene under den arver typen

Siden klasser definerer typer. Og siden klasser kan ha subclasser. Så finnes det naturligvis også subtyper.
I dette tilfelle mener jeg da typer som instanser eller objekter

Hvis vi sier at vi lager en arrayList som tar i mot instrumenter. Da vil det også ta i mot gitar. Fordi gitar en en subtype av instrument. Siden denne typen, altså et objekt av gitarklassen, ligger under instrument i typehierarkiet.

Men det ville ikke gådt den andre veien. Så hvis man har en mer speisialesert arrayList som bare tar i mot gitarer. Så kan man ikke legge for eksempel et objekt av instrument klassen inne i der. Så den vil ikke ha tatt i mot et instrumentsubtype, siden den ser bare etter gitarer.

-----------------------------------------------------------------------------
private and public
Hvis felt er private i superclassen vil ikke subclassene få tilgang til de ved mindre superclassen lageren getter / mutator metode til dme
Public felt er annereldes, subclassene kan få tak i dem akkurat som de skulle vært lagret lokalt, og trenger ingen variabler, fordi metodene er del av samme objekt.

Superclass constructor
The constructor of a subclass must always invoke the constructor of its superclass as its first statement. If the source code does not include such a call, Java will attempt to insert a call automatically.

subklasse er en klasse som utvider som en klasse

abstract classes
Classes that are not intended to be used to create instances, but whose purpose is exclusively
to serve as superclasses for other classes (such as Post and CommentedPost), are called
abstract classes.