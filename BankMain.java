package HomeWork.HomeWork02.HomeWork5;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Costumer costumer01 = new Costumer();
        costumer01.name = "Jonas";
        costumer01.age = 37;
        costumer01.bankBalance = 15000;
        costumer01.currentCash = 1200;
        costumer01.salary = 2700;

        Costumer costumer02 = new Costumer();
        costumer02.name = "Tadas";
        costumer02.age = 22;
        costumer02.bankBalance = 500;
        costumer02.currentCash = 300;
        costumer02.salary = 1700;

        Costumer costumer03 = new Costumer();
        costumer03.name = "Petras";
        costumer03.age = 45;
        costumer03.bankBalance = 6000;
        costumer03.currentCash = 5600;
        costumer03.salary = 3300;

        Scanner scanner = new Scanner(System.in);


        Bank bank = new Bank();
        System.out.println("Enter costumers name:");
        bank.name = scanner.nextLine();

        if (bank.name.equals(costumer01.name)) {

            bank.greet();

            bank.action = scanner.nextInt();
            scanner.nextLine();
            if (bank.action == 1) {
                System.out.println("Amount you wish to add to your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.addToAccount(costumer01);
            } else if (bank.action == 2) {
                System.out.println("Amount you wish to take out from your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.takeOutFromAccount(costumer01);
            } else if (bank.action == 3) {
                System.out.println(costumer01.bankBalance);
            } else if (bank.action == 4) {

                System.out.println("Enter receiver's name: ");
                String receiverName = scanner.nextLine();

                System.out.println("Enter the amount you wish to transfer: ");
                bank.cashAmount = scanner.nextDouble();

                if (receiverName.equals(costumer02.name)) {
                    bank.transferMoney(costumer01, costumer02, bank.cashAmount);
                    System.out.println("Jonas bank balance: " + costumer01.bankBalance);
                    System.out.println("Tadas bank balance: " + costumer02.bankBalance);
                } else if (receiverName.equals(costumer03.name)) {
                    bank.transferMoney(costumer01, costumer03, bank.cashAmount);
                    System.out.println("Jonas bank balance: " + costumer01.bankBalance);
                    System.out.println("Petras bank balance: " + costumer03.bankBalance);
                } else {
                    System.out.println("Receiver doesn't exist.");
                }
            } else {
                System.out.println("Please choose a correct action!");
            }
        } else if (bank.name.equals(costumer02.name)) {

            bank.greet();

            bank.action = scanner.nextInt();
            scanner.nextLine();
            if (bank.action == 1) {
                System.out.println("Amount you wish to add to your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.addToAccount(costumer02);
            } else if (bank.action == 2) {
                System.out.println("Amount you wish to take out from your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.takeOutFromAccount(costumer02);
            } else if (bank.action == 3) {
                System.out.println(costumer02.bankBalance);
            } else if (bank.action == 4) {

                System.out.println("Enter receiver's name: ");
                String receiverName = scanner.nextLine();


                System.out.println("Enter the amount you wish to transfer: ");
                bank.cashAmount = scanner.nextDouble();

                if (receiverName.equals(costumer01.name)) {
                    bank.transferMoney(costumer02, costumer01, bank.cashAmount);
                    System.out.println("Tadas bank balance: " + costumer02.bankBalance);
                    System.out.println("Jonas bank balance: " + costumer01.bankBalance);
                } else if (receiverName.equals(costumer03.name)) {
                    bank.transferMoney(costumer02, costumer03, bank.cashAmount);
                    System.out.println("Tadas bank balance: " + costumer02.bankBalance);
                    System.out.println("Petras bank balance: " + costumer03.bankBalance);
                } else {
                    System.out.println("Receiver doesn't exist.");
                }
            } else {
                System.out.println("Please choose a correct action!");
            }
        } else if (bank.name.equals(costumer03.name)) {

            bank.greet();

            bank.action = scanner.nextInt();
            scanner.nextLine();
            if (bank.action == 1) {
                System.out.println("Amount you wish to add to your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.addToAccount(costumer03);
            } else if (bank.action == 2) {
                System.out.println("Amount you wish to take out from your account: ");
                bank.cashAmount = scanner.nextDouble();
                bank.takeOutFromAccount(costumer03);
            } else if (bank.action == 3) {
                System.out.println(costumer03.bankBalance);
            } else if (bank.action == 4) {

                System.out.println("Enter receiver's name: ");
                String receiverName = scanner.nextLine();

                System.out.println("Enter the amount you wish to transfer: ");
                bank.cashAmount = scanner.nextDouble();

                if (receiverName.equals(costumer01.name)) {
                    bank.transferMoney(costumer03, costumer01, bank.cashAmount);
                    System.out.println("Petras bank balance: " + costumer03.bankBalance);
                    System.out.println("Jonas bank balance: " + costumer01.bankBalance);
                } else if (receiverName.equals(costumer02.name)) {
                    bank.transferMoney(costumer03, costumer02, bank.cashAmount);
                    System.out.println("Petras bank balance: " + costumer03.bankBalance);
                    System.out.println("Tadas bank balance: " + costumer02.bankBalance);
                } else {
                    System.out.println("Receiver doesn't exist.");
                }
            } else {
                System.out.println("Please choose a correct action!");
            }
        } else {
            System.out.println("Customer doesn't exist.");
        }

    }
}
