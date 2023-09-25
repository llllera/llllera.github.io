import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Scanner ln=new Scanner(System.in);

        System.out.println("Введите данные для авто");
        System.out.println("Введите марку");
        String marka=ln.nextLine();
        System.out.println("Введите номер");
        String number=ln.nextLine();
        System.out.println("Введите вин");
        String vin=ln.nextLine();
        System.out.println("Введите од выпуска");
        int year=sc.nextInt();
        System.out.println("Введите объем двигателя");
        double vol=sc.nextDouble();
        System.out.println("Введите цену");
        int price=sc.nextInt();
        System.out.println("Введите пробег");
        int km=sc.nextInt();
        Avto a=new Avto(marka, number, vin, year, vol, price, km);
        System.out.println("Данные авто");
        System.out.println(a.toString());
        System.out.println("Введите стоимость за км");
        int pricekm=sc.nextInt();
        System.out.println("Введите фио водителя");
        String f=ln.nextLine();

        Taxi t=new Taxi(marka, number, vin, year, vol, price, km,f, pricekm);
        System.out.println("Введите альность расстояния");
        double km1=sc.nextDouble();
        System.out.println("Стоимость поездки"+t.stoim(km1));
        System.out.println("Данные такси");
        System.out.println(t.toString());

    }
}