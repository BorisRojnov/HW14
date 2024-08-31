import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        //todo Дописать логику работы метода сюда. Метод main не трогаем!!!
        double result = 0;
       String inToString = String.valueOf(num);
        for(int i = 0; i < inToString.length(); i++){
           Double inToDouble = Double.parseDouble(String.valueOf((inToString.charAt(i))));
           result += inToDouble;
        }
        return (result / inToString.length()); //todo заменить 0 на корректный результат.
    }
}
