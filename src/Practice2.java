import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите вашу творожную массу");
        double m =  Double.parseDouble(br.readLine());
        System.out.println("введите ваш рост");
        double h =  Double.parseDouble(br.readLine());
        double imt;
        char exit;
        System.out.println("ваш рост" + h + "ваш вес" + m);
        imt = m / (h * h);
        System.out.println("Ваш индекс массы тела равен" + imt);
        do {
            if (imt < 18.5) {
                System.out.println("Соберись тряпка и начни жрать.Надо подкачаться");
            } else if (imt >= 18.5 && imt <= 24.9) {
                System.out.println("Едрить,Вы спортсмен");
            } else if (imt >= 24.9 && imt <= 29.9) {
                System.out.println("Жирный дрищь");
            } else if (imt >= 30) {
                System.out.println("Ах тыж жирная жопа!");
            }
            System.out.println("Вы хотите выйти в окно? y/n?");

            exit = scanner.next().charAt(0);
        } while (exit != 'y');


    }

    /*
    public class Configuration {
        // double m; //mass
        // double h; //height

        //public void personalCharacteristics(double m, double h) {
        //}

        public void imtmath(double imt, double h, double m) {
            //double imt; //body mass index
            imt = m / (h * h);
        }
    }
    */


}
