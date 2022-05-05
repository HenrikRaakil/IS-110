
## M12 Abstrakt Klasse
Vet hva en abstrakt klasse er, hva som er hensikten, og kan definere og bruke en abstrakt klasse i ett konkret prosjekt.

En abstrakt klasse er en klasse som eksisterer hovedsakelig bare for at andre klasser skal arve egenskapene til den abstrakte klassen, og derfor ikke brukt so mye direkte selv. Når man gjør en klasse abstrakt kan man for eksempel ikke lenger lage instanser av den klassen.

Hensikten med abstrakte klasser er at det er en del av data abstraksjonsprinsippet som går ut på å gjemme noen detaljer med informasjon som er urelevant, og bare vise essensiele deler av koden for andre deler av koden. Med andre ord det går på å redusere coupling og øke cohesion.

* For å lage en abstrakt klasse skriver man bare annoteringen "abstract" ved klassenavnet
* Må ha en abstrakt klasse hvis man skal bruke minst én abstrakt metode i klassen
* Man kan ha vanlig metoder i en abstrakt klasse

[Vis eksempelkode -> Interfaces and Abstract Classes]

## M12 Abstrakt Metode
Vite hvorfor vi bruker abstrakte metoder, når vi kan bruke det, og kunne demonstrere bruken i praksis. Spm 1:Må vi ha abstrakte metoder i en abstrakt klasse?  Spm 2: Kan vi ha en abstrakt metode i en klasse som IKKE er abstrakt?

1. Nei man må ikke. Abstrakte klasser kan ha både abstrakte metoder og vanlige metoder liggene i seg.
2. Nei det går ikke. Hvis man skal bruke abstrakte metoder, så man også ha dem i en abstrakt klasse.

Vi bruker abstrakte metoder til ting som metodepolymorfi der vi kan ha flere subklasser som arver den abstrakte metoden fra en abstrakt klasse, slik at de kan ta i bruk den abstrakte metoden, g endre innholdet slik at det passer hver subklasse selv. Når formålet med metoden er at den skal bli arvet og endret, så er et ingen grunn til at den skal ha en egen kropp med kode i seg i superklassen. Derfor blir superklassen gjort om til en abstrakt klasse, og metode blir gjort til en abstrakt metode.

[Vis den abstrakte metoden i AbstractClass og i subclass 2]

## M12 Interface
Vet hva et interface er, hva som er hensikten, og kan definere og bruke et interface i ett konkret prosjekt. 

Et interface i Java er noe annet fra en abstrakt klasse, vanlig klasse og superklasse. Interfaces blir brukt for å spesifisere oppførselen til en klasse. Et Interface er et slags blueprint av en klasse som inneholder abstrakte metoder som andre klasser kan arve.

Akkuratt som klasser kan interfaces holde metoder og variabler, men metodene i et interface er automatisk satt som abstrakte. Det betyr da også at den ikke kan inneholde noe kode innenfor hver av metodene, bare metodesignaturen.

* Interface er noe annet fra abstrakt klasse / vanlig klasse / superklasse
* I BlueJ lager man interface ved å høyreklikke og velge det, akkurat som en klasse
* En klasse kan arve uendlig antall med interfaces, de kan også arve fra en superklasse / abstrakt i tilegg

Hensikten med et interface er at den i motsetning til superklasser og abstrakte klasser, så kan en subklasse arve et uendlig antall med interfaces. Det betyr at én klasse kan ha for eksempel 10 forskjellige interfaces, men bare én superklasse.

[Vis til eksemplet]

## M12 Abstrakt klasse eller interface?
* Hovedforskjellen mellom en klasse og et interface det er at én klasse kan arve et uendlig antall sett med interfaces, men en klasse kan bare arve fra én abstrakt klasse om gangen.

Hva taler for og mot for å bruke interface framfor en abstrakt klasse?

Det går hovedsakelig på det jeg snakket om. Et Interface er mer nyttig når en klasse skal arve flere spesifikke egenskaper fra mange forskjellige steder. Egenskapene kan bli delt opp i mindre biter fordelt på mange forskjellige interfaces. På den måten kan klasse 1 arve egenskap A, B og D. Mens klasse 2 kan arve egenskap B, C og E. På den måten kan man mikse metoder og variabler mellom klasser, og spesifisere i mer detalj på hvem som skal ha hva, noe som skaper kontroll i koden og senker coupling.

Hva taler for og mot for å bruke abstrakt klasse framfor ett interface?

Abstrakt klasse ligner mye mer på vanlige superklasser som vi er vant til. Fordelen med abstrakte klasser er at de kan ha en constructor og ha egne felt. Abstrakte klasser har de samme fordelene som en vanlig superklasse vil ha. Så når man vil dra nytte av en constructor som kan sette opp verdier, men man vil forstatt benytte seg av abstrakte metoder. Da er en abstrakt klasse en veldig god løsning.

### *Inteface*
* Mangler felt og constructor
* Kan bare ha abstrakte metoder
* én klasse kan arve fra en uendlig mengde med interfaces
```java
public interface Interface{}

public class SubClass implements Interface{}
```

### *Abstrakt klasse*
* Veldig lik en vanlig klasse / superklasse
* Har tilgang til felt og consructor
* Kan ha vanlig metoder og abstrakte metoder
* én klasse kan bare ha én abstrakt klasse den arver fra om gangen, akkurat som en superklasse og subklasse.
```java
public abstract class AbstractClass{}

public class SubClass extends AbstractClass{}
```
