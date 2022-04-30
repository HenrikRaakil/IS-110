## M11 public, private, protected					v
Studenten skal kunne forklare betydningen til nøkkelordene public, private og proteced, og forklare hvordan de påvirker arv

Dette har med Synlighet å gjøre. En veldig kjapp oppsumering av de forskjellige typene er at variabler, metoder og klasser deklarert med Public er 
tilgjengelig for resten av koden. Det er helt åpent. I motsetning så har man Private, der det som har blitt deklarert er kun tilgjengelig for koden i kodeblokken, og man må bruke en getter og setter metode for å å få tilgang i andre klasser. Og til slutt har man Protected.

Det nevnte jeg i modul 10, men en kjapp oppsummering er at urelaterte klasser vil ikke ha tilgang til variablene med protected på seg, men klasser som arver vil fortsatt ha tilgang til det.
ligner på private bortsett fra at den gir tilgang til klasser som er extenda. Igjen kan man ta eksempelet med at jeg har nøkkelen til huset til pappa, men ikke har nøkkelen til huset til naboen. Siden jeg liksom har arvet nøkkelen til pappa.

Når det kommer til access modifiers som er det public, private og protected er når det kommer til arv, r det noen enkle regler som blir fulgt.
Metoder deklarert med public i en superklasse, må også bli deklarert som public i alle subklasser.
Metoder deklarret med proteced i en superklasse må enten være deklarert med protected eller public i alle subklasser, de kan ikke være private eller så får ikke subklassene tilgang til metodene.
Metoder deklarert med private blir ikke arvet i det hele tatt, så det finnes ingen regler for dem.

## M11 Statisk og dynamisk type 					v
Studenten skal kunne forklare begrepene statisk og dynamisk type, og hva slags betydning de har når koden skrives og kompileres, og når den kjører

Statisk og dynamisk type går på noe som heter method binding eller method lookup på engelsk. Og det handler om hvordan kompilatoren og runtime oppfører seg etter hva slags informasjon som er tilgjengelig for dem.

Hvis jeg skal forklare dette så må jeg først forklare hva runtime er. Runtime det er når ferdigkompilert java kode blir kjørt. Det er det som skjer når man starter et vanlig program. Datamaskinen har allerede gjort beregningene den skal og nå bare leser den ferdigkompilerte binærkoden.

Så først og fremst hva er hovedforskjellen mellom statisk og dynamisk type? Det er at i statiske typedeklarasjonen så vet man allerede hva inneholdet kommer til å være. Derfor er en ferdigdeklarert type
 blir kalt for en statisk type, fordi den er allerede skrevet inn i kildekoden til programmet. Det betyr at hver gang programmet kompilerer så vil objektene som er deklarert alltid være like.

Mens objekter lagret i variabler blir kalt for dynamiske, fordi inneholdet i objektene forandrer seg fra runtime til runtime, etter hvilke verdier som blir satt da koden blir kjørt. Man vet altså ikke på forhånd hva objektene i dynamiske typer er før man kjører koden.


## M11 Polymorfe metoder							V
Studenten skal kunne forklare hva polymorfe metoder er, og vise eksempler på polymorfe metoder i egen kode eller eksempler

Det fikk jeg forklart hva var i modul 10, så jeg trenger ikke å sløse vekk tiden din med. Men kort oppsummert så er polymorfe metoder, metoder en subklasse arver fra en superklasse, og forandrer på inneholdet gjennom overriding. Så hvis en subklasse arver en metode som heter print og den allerede har en metode som heter print, så vil bare koden skrevet i subklassen kjøre, fordi den overrider den andre koden fra superklassen.

Det finnes to typer polyformisme i Java, som kommer fra forskjellen på statisk og dynamiske typer. Den ene er compile-time polyformisme og den andre er runtime polyformisme.


## M11 Omdefinere metoder (overriding)				V
Studenten skal kunne forklare begrepet overriding, og kunne skrive klasser som omdefinerer metoder

Overriding er en stiuasjon der en metode er definert i en superklasse, og en metode med det samme navnet også er definert i subklassen. Man kan bruke annoterting @Override over metoden for å indikere at dette er en ny versjon av en arvede metode.

Så override er å ta en eksisterende metode som har blitt arvet, og endre på hva inneholdet i den metoden gjør. På denne måte kan flere subklasser arve felles metoder fra superklassen, men fortsatt gjøre små endringer som passer til oppgavene de har bedre.

## M11 Likhet mellom objekter
Studenten skal kunne forklare forskjellen på samme objekt, og like objekter, og kunne omdefinere equals() og hashCode() slik at de definerer likhet for egne klasser

Ofte så kan det være nyttig å finne ut av om to objekter er "like" i hermetegn. Object superklassen definerer to metoder, equals() og hashCode().
Disse metodene henger godt sammen med det å finne ut av likheter.

Hvis to objekter er det samme objektet, så refererer de begge til en og samme objekt i minne
Så hvis Var1 = Katt og ArrayList.add(Var1) kjøres, så vil ArrayList og Var1 ha samme objektet

[Lag ny klasse og skriv inn]

```java
// Objekt katt
var1 = katt;
ArrayList.add(var1);
```

Det var da forksjellen på samme objekt, og like objekter. Og hvis vi går tilbake til equals() og hashCode() da.
Man overskriver metodene for å impementere egne regler, på denne måten kan man diktere selv hva reglene er for å test like objekter. Dete er viktig fordi måten man tester på kan vareiere fra program til program.

Forskjellen mellom equals() og hashCode() i Java er at equals() blir brukt for å sammenligne to objekter, mens hashCode() blir brukt for å "hashe" objektene. Det vil si å bestemme hvilke gruppe et objekt skal bli kategorisert inn i. Derfor vil også hashCode() returner alltid en int verdi, selv om man har overskrivet reglene på den.

Tingen er å putte inn ditt eget regnestykke som tar i bruk egne verdier du bruker i klassene du lager


### Eksempel på equals()
```java
@Override
public boolean equals(Object obj)
{
	if(this == obj){
		return true;
	}
	if(! (obj instanceof Animal)) {
		return false;
	}
	Animal other = (Animal) obj;
	return animalType.equals(other.animalType);
}
```

Hashkode er en verdi som lages ut ifra verdiene til objektet koden genereres fra
Poenget med hashCode() er å lage en tallkode du kan bruke for å sammenligne objektene, og hvis verdiene er ulike, blir hashkoden deres også ulik

### Eksempel på hashCode()
```java
@Override
public int hashCode() {
    return (int) id * brand.hashCode() * color.hashCode();
}
```