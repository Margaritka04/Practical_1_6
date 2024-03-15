import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Вариант 1; Стетюха Маргарита Сергеевна; РИБО-04-22");
        Scanner scanner = new Scanner(System.in);
        Autoservice avtoservice = new Autoservice();
        Automobile avtomobil = new Automobile();

        System.out.println("Введите марку автомобиля: ");
        avtomobil.setModel(scanner.nextLine());
        System.out.println("Введите максимальную скорость автомобиля: ");
        avtomobil.setMaxSpeed(scanner.nextInt());
        System.out.println("Введите пробег автомобиля: ");
        avtomobil.setProbeg(scanner.nextInt());

        avtomobil.setModel(avtoservice.modify(avtomobil.getModel()));
        System.out.println(avtomobil.getModel() + ", " + avtomobil.getProbeg() + ", " + avtomobil.getMaxSpeed());

    }
}
