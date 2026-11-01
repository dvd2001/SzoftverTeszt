# BankAccount – JUnit 5 Egységtesztelés

A projekt egy egyszerű bankszámlát modellező Java osztályt (`BankAccount`) és annak JUnit 5 segítségével megvalósított egységtesztjeit tartalmazza.

## Követelmények
- Java JDK 17+
- Apache Maven 3.8+

## Projekt fordítása és tesztelése

Tesztek futtatása Maven segítségével:
```bash
mvn test

# BankAccount – Mockito Tesztelés

Ez a projekt a `BankAccount` osztály kiegészített változatát és annak Mockito keretrendszerrel megvalósított egységtesztjeit tartalmazza.

## Megvalósított elemek

- **NotificationService**: Értesítések küldéséért felelős interfész.
- **ExchangeRateService**: Devizaárfolyamok lekérdezéséért felelős interfész.
- **BankService**: A tranzakciókat és az értesítéseket koordináló osztály (Dependency Injection-nel).
- **BankServiceTest**: JUnit 5 + Mockito tesztesetek (`@Mock`, `verify()`, `when().thenReturn()`, `verifyNoInteractions()`).

## Követelmények

- Java JDK 17+
- Apache Maven 3.8+

## Tesztek futtatása

```bash
mvn clean test