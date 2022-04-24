package pl.WaskiCarShowroom;

import java.util.List;
import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private double accountBalance;
    private double price;


    public double getAccountBalance() {
        return accountBalance;
    }

    public void addMeans() {
        System.out.println("Podaj kwotę jaką chcesz przelać na konto");
        price = scanner.nextDouble();
        accountBalance += price;
        System.out.println("Pomyślnie dodano środki");
    }
   public void addMeansForCar(int price) {
       accountBalance += price;
   }
public void subtractMeans(int price) {
        accountBalance -= price;
}




}
