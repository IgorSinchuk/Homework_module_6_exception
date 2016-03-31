import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class Weather {


    public final double CONST_32 = 32;
    public final double CONST_5 = 5;
    public final double CONST_9 = 9;
    public  void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Конвертация прогноза погоды. Введите значение: ");
        int celsius = Integer.parseInt(reader.readLine());
        System.out.println("Сейчас " + fahrenheit(celsius) + " градуса(ов) по Фаренгейту");

        System.out.println("А теперь в градусах по Цельсию");
        int fahrenheit = Integer.parseInt(reader.readLine());
        System.out.println("Сейчас " +celsius(fahrenheit) + " градуса(ов) по Цельсию");}



    double celsius(double tempInFahrenheit) {
        return ((tempInFahrenheit - CONST_32) * (CONST_5 / CONST_9));
    }

    double fahrenheit(double tempInCelsius) {
        return ((tempInCelsius * CONST_9 / CONST_5) + CONST_32);
    }

    }



