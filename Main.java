import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException {
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        String b = arr[1];
        int c = Integer.parseInt(arr[2]);
        int res;

        if(a < 1 || a > 10 || c < 1 || c > 10){
            throw new IOException("Введите числа от 1 до 10");
        }
        if(arr.length != 3){
            throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        switch(b){
            case "+" :
                res = a + c;
                break;
            case "-" :
                res = a - c;
                break;
            case "*" :
                res = a * c;
                break;
            case "/" :
                res = a / c;
                break;
            default:
                throw new IOException("Вы ввели некорректный арифметический знак");
        }
        return Integer.toString(res);
    }
}