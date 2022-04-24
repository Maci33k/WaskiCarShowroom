package pl.WaskiCarShowroom;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        Transactions t = new Transactions();



        Account account = new Account();
        boolean shouldContinue = true;
        int choice;

        while (shouldContinue) {
            System.out.println("1. Wyświetl samochody");
            System.out.println("2. Dodaj samochód");
            System.out.println("3. Usuń samochód");
            System.out.println("4. Sprawdź czy samochód znajduje się w bazie danych");
            System.out.println("5. Sprawdź stan konta");
            System.out.println("6. Dodaj środki do konta");
            System.out.println("7. Sprzedaj samochód");
            System.out.println("8. Kup samochód");
            System.out.println("9. Wyświetl historię transakcji");
            System.out.println("10. Wyjdź");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    car.showCars();
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 2 -> {
                    car.addCar();
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 3 -> {
                    car.deleteCar();
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 4 -> {
                    car.isCarThere();
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 5 -> {
                    System.out.println("Stan konta: " + account.getAccountBalance() + " zł");
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 6 -> {
                    account.addMeans();
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 7 -> t.sellCar(car,account,car.listOfPrices,car.list);
                case 8 -> t.buyCar(car,account);
                case 9 -> {
                    t.transactionsHistory(car, account);
                    try { System.in.read(); } catch (IOException ex) { }
                }
                case 10 -> shouldContinue = false;

            }
        }


    }

}
