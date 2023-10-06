import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner line=new Scanner(System.in);
        System.out.println("Введите марку");
        String mark=line.nextLine();
        System.out.println("Введите объем топливного бака");
        int vol=sc.nextInt();
        System.out.println("Введите максимальную дальность полета");
        int km=sc.nextInt();
        System.out.println("Введите кол-во посадочных мест для пассажироского самолета");
        int kolvo=sc.nextInt();
        Passenger p= new Passenger(mark, vol, km, kolvo);
        System.out.println(p.toString());
    }}
