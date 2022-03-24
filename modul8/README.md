## M8 Coupling*-
Du har nådd læringsmålet når du kan forklare
- hva coupling er
- hva som bidrar til tettere coupling
- hva som kan redusere den,
- konsekvensene av for tett kobling.

Coupling handler om hvordan forskjellige klasser og metoder i programmet henger sammen. Man kan ha ulik grad av coupling. Desto høyere coupling, desto vanskeligere blir det å gjøre endringer i én del av programmet, uten at det får konsekvenser for andre deler av programmet. Når et program har mye coupling blir det kalt for tight coupling. Og motsatt når et program har en lav mengde med coupling, blir et kalt for loose coupling.

Det er viktig å prøve få til så loose coupling som mulig slik at det blir lettere å gjøre endringer i programmet man har skrevet. En annen grunn til at det er viktig å unngå tight coupling er at det kan være veldig tidkrevende og vanskelig å finne all tilleggskoden som må bli endret på grunn av endring i koden.

### Example Tight Coupling
Et eksempel på noe som kan bidra til tettere coupling er 

- Public felt som blir styrt av en annen klasse

- så mye som mulig la sin egen klasse styre for seg selv
- bruke public felt for å dele informasjon mellom klasser


### Example Loose Coupling
bruke getter-metoder som returner verdier som skal dele, ansvarsdrevet. private felt, gjør noe privat, avkjører du muligheten for coupling.
Et eksempel på hva som kan redusere coupling er encapusulaiton. Som jeg skal ha om litt etterpå.
- loose => Interkajsojn gjennom metode kall

For å konkludere så er loose coupling bedre å ha i programmet sitt fordi den skaper mer fleksibilitet og bedre skalering av programmet, samtidig som det bidrar til å redusere jobben man får ved å gå gjennom all koden sin for å gjøre én liten endring.
private felt og metoder
		Hinder ukontrollert akksessering av feltene 


## M8 Cohesion*BlueJ
Du har nådd læringsmålet når du kan forklare hva cohesion er, og hva som er god og dårlig cohesion. Du skal også kunne peke på tilfeller av god og dårlig cohesion i egen kode og eksempler. Er fordelingen logisk? Navn på ting, hvilke metoer hører til hvilke klasser. Hva metodene gjør osv.

I BlueJ boka står det at Cohesion henger sammen med antallet og diveransene av de ulike oppgavene der en enkelt enhet har ansvaret. Med andre ord Cohestion handler om at én enhet i koden burde ha én funksjon og ikke mer for å hindre overkomplisering av koden. Noe som fører til tight coupling.

En metode burde implementere én logisk operasjon, og en klasse burde bare representere én type enhet. Hovedformålet bak cohesion er gjenbrukbarhet. Hvis en metode eller en klasse har ansvar for bare én godt designet oppgave, Så er det en mye større sjanse at den kan bli brukt igjen i en annen kontekst av andre klasser og metoder.











## M8 Encapsulation*.
Læringsmålet er nådd når du kan forklare hva encapsulation er, og kan demonstrere det i praksis

Inkkaplsing pakke variabler og metoder i én enhet, Gjemme og skjerme data med ghjelp av getter-metode
variable ligger beskyttet i en metode. public felt er fyfy, bruker private felt, public getter-metode
Brukes til å definere klassene.
Innkappsulereing skjuler deler av koden for å 

Formålet med å bruke encapsualtion er å skjule informasjon som er knyttet til implemetering av koden, og heller ha fokuset på å utrykke kodens funksjon som informasjon. 








## M8 Code Ducplication*.
Læringsmålet er nådd når du kan forklare begrepet code duplication, og forklare hvorfor det ikke er ønskelig. Du skal også kunne forklare  sammenhengen mellom code duplication, coupling og cohesion

Code Duplication eller kode duplikasjon er som navnet sier. Det er kode som er veldig lik eller identisk som dukker opp flere ganger i samme program og til og med i samme klasse! Ofte så er en løsning på code duplication at man bare har én metode som inneholder koden man trenger og så kaller man på metoden når man trenger den.

Det er mange grunner til hvorfor code duplication ikke er ønskelig. Hvis vi igjen går ut ifra eksemplet med at vi bare kaller på metoden så vil det for eksempel gjøre koden mer effektiv siden kompliatoren ikke trenger å lese identiske linjer med kode flere ganger, og kan bare bruke allerde ferdigkompilert kode som er lagret i minne. En annen grunn til hvorfor det ikke er ønskelig med kode duplikasjon er jo at det vil ta lengre tid å skrive koden uten hensikt, siden man skriver de samme linjene flere ganger. Noe som bruker opp tid man kunne ha til for eksempel debugging og anenn refaktorering. Og det tredje eksemplet jeg kan nevne er at koden blir mer uoversiktlig når man har mye duplisert kode. Det er vanskelig å vite hva slags kontekst koden har når den er identisk med andre kodeblokker andre steder i programmet.

Hvis det ikke gir mening at to klasser skal ha ansvar for samme metode. Så er det bedre å lage en egen klasse til den metoden.
Med for mange klasser blir det rotete og med for få klasser blir det for tunge å navigere. Siden hver klasse blir for stor, 
Derfor må man må prøve å finne en mellomting

Når det er sakt så er kode duplisering greit hvis alternativet er et mareritt. For ekesmpel hvis man allerde er dypt inne i et stort program og man har tight coupling. Men hvis det lar seg gjøre, så bør man alltid unngå kodeduplisering



## M8 Localizing change*-
Du har nådd læringsmålet når du kan forklare begrepet localizing change, og hvilke faktorer som påvirker om endringer kan være lokale

Målet med bruk av localizing change er å designe klasser på en slik måte som gjør at det er enkelt å finne hvor de eventuelle tilleggsstedene i koden som har blitt endret som en følge av en endring man har gjort. Hvis man for eksempel har en klasse som har som oppgave å styre prissetting på ulike varer i en nettbutikk. Og man skal endre på prisen på en vare. Da er det en fordel at man bare har en klasse som styrer prissetting og at innenfor denne klassen har man én hovedmetode som heter for eksempel prisliste. 

Hvis dette er tilfelle, så vil det være enkelt å finne fram til denne metoden slik at man kan enkelt gjøre endringen man trenger. Dette henger godt sammen med cohesion i det at dette også går på god navngiving og at man putter klasser og metoder der det er logisk. 



## M8 Refactoring *BlueJ* 
Du har nådd læringsmålet når du kan forklare hva refactoring og hva som er effecten av refactoring. Du skal kunne vise hva refactoring er i konkrete tilfeller (i din egen kode, eller i eksemplene fra boka
Oppussing, dele opp oppgaver i mindre moduler. Gå igjennom koden og bruke alle begrepene







## M8 Responsibility-driven design*-
Du har nådd læringsmålet når du kan forklare hva Responsibility driven design betyr, og drøfte hva slags effekt responsibility-driven design har på coupling og cohesion

Responsibility driven- design handler om ideen om at hver klasse i applikasjonen burde være ansvarlig for behanling av sin egen data. Ofte når vi trenger å legge til ny funksjonalitet i en applikasjon så må vi splørre oss selv spørsmålet om i hvilken klasse burde vi legge til en metode for å få den nye funksjonen? Svaret er at den samme klassen som er ansvarlig for å lagre data som den nye funksjonen trenger pgs¨burde ha ansvaret for den.

Altså dataen og metoden den nye funksjonen trenger burde vøre i samme klasse. Der hvor godt bruk av responsibility-driven design er med på å styre hvilken grav av coupling applikasjonen får, og dermer også hvor mye arbeid det kreves å legge til og endre nye funksjoner.

Et eksempel på responsibility-driven design og loose coupling er i World of Zuul eksemplet som hører til BlueJ boka. En av klassene "Room" har som oppgave å lagre de forskjellige rommene man kan gå til i spillet. God bruk av responsibility-driven esign gjør at det er lett å fjeren, ender eller legge til nye rom i klassen.