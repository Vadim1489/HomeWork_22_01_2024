import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Weather weather1 = new Weather();

        System.out.println("Здравствуйте! ");
        weather1.hello = scanner.nextLine();

        System.out.println("Как вас зовут? ");
        weather1.what_is_your_name = scanner.nextLine();
        System.out.println("Приятно познакомиться! " + weather1.what_is_your_name);

        System.out.println("Наша программа конвертирует градусы Цельсия в Фаренгейт. Если хотите узнать какая у вас температура по Фаренгейту? Введите гардусы по Цельсию: ");
        weather1.number = scanner.nextInt();

        double result =  (weather1.number * 1.8) + 32;


        System.out.println("Ваша температура в градусах по Фаренгейту: " +  result);

        System.out.println("Спасибо за внимание, до встречи!");



    }
}