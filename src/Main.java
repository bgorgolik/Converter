import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

class Degrees {

    BigDecimal celcius = new BigDecimal("0");
    BigDecimal kelvin = new BigDecimal("0");
    BigDecimal fahrenheit = new BigDecimal("0");
    BigDecimal ck = new BigDecimal("275.15");

    
    void calcCelcKel() {
        System.out.println("Wpisz Celcjusze");
        Scanner scanner = new Scanner(System.in);
        celcius = scanner.nextBigDecimal();
        if (celcius.compareTo(BigDecimal.valueOf(-275.15)) < 0) {
            System.out.println("Taka temperatura nie istnieje");
        }
        kelvin = celcius.add(ck);
        System.out.println(celcius + " stopni C to jest " + kelvin + " stopni kelv");
    }

    void calcKelCelc() {
        System.out.println("Wpisz Kelviny");
        Scanner scanner = new Scanner(System.in);
        kelvin = scanner.nextBigDecimal();
        if (kelvin.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Taka temperatura nie istnieje");
        }
        celcius = kelvin.subtract(ck);
        System.out.println(kelvin + " stopni K to jest " + celcius + " stopni c");
    }

    void eMinusPi() {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal e = new BigDecimal(Math.E);
        BigDecimal suma = new BigDecimal(0);
        suma = pi.add(e);
        System.out.println(" pi+e = " + suma);
        BigDecimal test = new BigDecimal(2 + 22 - 2);
        BigDecimal test2 = new BigDecimal(23);
        BigDecimal suma2 = new BigDecimal(0);
        suma2 = test.add(test2);
        System.out.println("test " + suma2);


    }

    void calcFahrCelc() {
        System.out.println("Wpisz Fahrenhaity");
        Scanner scanner = new Scanner(System.in);
        fahrenheit = scanner.nextBigDecimal();
        BigDecimal xyz = new BigDecimal(32);
        BigDecimal zyx = new BigDecimal(1.8);
        BigDecimal qwerty = new BigDecimal(0);
        BigDecimal ytrewq = new BigDecimal(0);
        qwerty = fahrenheit.subtract(xyz);
        ytrewq = qwerty.divide(zyx, 2, RoundingMode.CEILING);

        celcius = ytrewq;
        System.out.println(fahrenheit + " fahrenhait rowna sie " + celcius + " stopniom celciusza");
    }
    void calcCelcFahr(){
        System.out.println("Wpisz Celsjusze");
        Scanner scanner = new Scanner(System.in);
        celcius = scanner.nextBigDecimal();
        BigDecimal stala1 = new BigDecimal(32);
        BigDecimal stala2 = new BigDecimal(1.8);
        BigDecimal wynik1 = new BigDecimal(0);
        BigDecimal wynik2= new BigDecimal(0);
        wynik1 = celcius.multiply(stala2);
        wynik2 = wynik1.add(stala1);
        fahrenheit = wynik2.round(MathContext.DECIMAL32);
        System.out.println(celcius +" stopni celsjusza rowna sie " + fahrenheit + " stopni fahrera");
    }
}

public class Main {

    public static void main(String[] args) {
        Degrees deg = new Degrees();

        deg.calcCelcKel();

        deg.calcKelCelc();
        deg.eMinusPi();
        deg.calcFahrCelc();
        deg.calcCelcFahr();

    }
}

