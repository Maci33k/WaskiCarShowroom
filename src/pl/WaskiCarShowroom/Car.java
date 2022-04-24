package pl.WaskiCarShowroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

     List<String> list = new ArrayList<>();
     List<Integer> listOfPrices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String mark;
    private String name;
    private String markAndName;
    private int value;
    public Car() {}
    public Car(String mark, String name, String markAndName, int value) {
        this.mark = mark;
        this.name = name;
        this.markAndName = markAndName;
        this.value = value;
    }

    public void showCars() {
        if (list.isEmpty())
            System.out.println("Brak samochodów w bazie danych");
        for(int i=0; i<list.size();i++) {
            System.out.print(i + 1);
            System.out.print(". ");
            System.out.println(list.get(i));
        }
    }





    public void addCar() {
        System.out.println("Podaj markę samochodu");
        mark = scanner.next();
        System.out.println("Podaj nazwę samochodu");
        name = scanner.next();
        System.out.println("Podaj cenę");
        value = scanner.nextInt();
        listOfPrices.add(value);
        markAndName = mark + " " + name +  " " + value;
        list.add(markAndName);
    }

    public void deleteCar() {
        System.out.println("Podaj indeks samochodu który chcesz usunąć");
        int index;
        index = scanner.nextInt();
        list.remove(index-1);
    }

    public void isCarThere() {
        System.out.println("Podaj markę szukanego samochodu");
        mark = scanner.next();
        System.out.println("Podaj nazwę szukanego samochodu");
        name = scanner.next();
        int meter=0;
        for(int i=0;i<list.size();i++) {
            meter++;
            if(list.get(i).contains(mark + " " + name ))
                System.out.println("Samochód " + mark + " " + name + " znajduje się w bazie danych" +
                        " na pozycji numer " + meter);
            else System.out.println("Ten samochód nie znajduje się w bazie danych");


        }
    }





}
