package HomeWork.HomeWork02.HomeWork5;


public class Bank {
        double cashAmount;
        String address;
        String name;
        int action;

        void greet(){
            System.out.println("Hello, welcome to Swedbank.");
            System.out.println("How can we help you today?");
            System.out.println();
            System.out.println("1. Add money to the account.");
            System.out.println("2. Take money from your account.");
            System.out.println("3. Check your balance.");
            System.out.println("4. Transfer money.");

            System.out.println("Please select a action you would like to proceed.");
        }


        void addToAccount(Costumer costumer) {
            if(costumer.currentCash >= cashAmount){
                System.out.println("Transaction was made!");
                costumer.bankBalance = costumer.bankBalance + cashAmount;
                System.out.println("Your current account balance is: " + costumer.bankBalance);
            }else {
               System.out.println("Costumer doesn't have enough cash. Transaction declined");
            }
        }

        void takeOutFromAccount(Costumer costumer) {
            if(costumer.bankBalance >= cashAmount){
                System.out.println("Transaction was made!");
                costumer.bankBalance = costumer.bankBalance - cashAmount;
                System.out.println("Your current account balance is: " + costumer.bankBalance);
            } else {
                System.out.println("Costumer doesn't have enough money in his account. Transaction declined.");
            }
        }

        void transferMoney(Costumer sender, Costumer receiver, double amount) {

            if(amount > 0 &&  sender.bankBalance >= amount) {
                sender.bankBalance = sender.bankBalance - amount;
                receiver.bankBalance = receiver.bankBalance + amount;
                System.out.println("Transferred " + amount + " from " + sender.name + " to " + receiver.name);
            } else {
                System.out.println("Invalid transfer or insufficient funds.");
            }
        }


   }
