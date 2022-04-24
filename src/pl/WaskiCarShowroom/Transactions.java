package pl.WaskiCarShowroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions extends Car{
    Scanner scanner = new Scanner(System.in);
    List<String> transactions = new ArrayList<>();
    public void sellCar(Car car, Account account, List<Integer> list, List<String> list2) {
      int index;
      int price;
        System.out.println("Podaj index samochodu, który chcesz sprzedać");
        index = scanner.nextInt();
        price = list.get(index-1);
        account.addMeansForCar(price);
        transactions.add("Sprzedano" + car.list.get(index-1) + "zł");
        list2.remove(index-1);
        list.remove(index-1);
    }
    public void buyCar(Car car, Account account) {
        int price;
        car.addCar();
        price = car.listOfPrices.get(car.listOfPrices.size()-1);
        account.subtractMeans(price);
        transactions.add("Kupiono " + car.list.get(car.list.size()-1) + "zł");
    }
    public void transactionsHistory(Car car, Account account) {
        for(int i=0; i<transactions.size();i++) {
            System.out.print(i + 1);
            System.out.print(". ");
            System.out.println(transactions.get(i));
        }

    }
    }
