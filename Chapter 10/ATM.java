import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int selectedId = -1;
        int action = 0;
        int ammount = 0;
        Account a0 = new Account(0, 100);
        Account a1 = new Account(1, 100);
        Account a2 = new Account(2, 100);
        Account a3 = new Account(3, 100);
        Account a4 = new Account(4, 100);
        Account a5 = new Account(5, 100);
        Account a6 = new Account(6, 100);
        Account a7 = new Account(7, 100);
        Account a8 = new Account(8, 100);
        Account a9 = new Account(9, 100);

        while (selectedId != -5) {
            if (selectedId == -1) {
                System.out.println("Enter an id: ");
                selectedId = input.nextInt();
            }
            System.out.println("Main menu");
            System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
            System.out.println();
            System.out.println("Enter a choice: ");
            action = input.nextInt();
            if (action == 1) {
                switch (selectedId) {
                    case 0:
                        System.out.println("The balance is " + a0.getBalance()); break;
                    case 1:
                        System.out.println("The balance is " + a1.getBalance()); break;
                    case 2:
                        System.out.println("The balance is " + a2.getBalance()); break;
                    case 3:
                        System.out.println("The balance is " + a3.getBalance()); break;
                    case 4:
                        System.out.println("The balance is " + a4.getBalance()); break;
                    case 5:
                        System.out.println("The balance is " + a5.getBalance()); break;
                    case 6:
                        System.out.println("The balance is " + a6.getBalance()); break;
                    case 7:
                        System.out.println("The balance is " + a7.getBalance()); break;
                    case 8:
                        System.out.println("The balance is " + a8.getBalance()); break;
                    case 9:
                        System.out.println("The balance is " + a9.getBalance()); break;
                }
            }
            else if (action == 2) {
                System.out.println("Enter an amount to withdraw: ");
                ammount = input.nextInt();
                switch (selectedId) {
                    case 0:
                        a0.setBalance(a0.getBalance() - ammount); break;
                    case 1:
                        a1.setBalance(a1.getBalance() - ammount); break;
                    case 2:
                        a2.setBalance(a2.getBalance() - ammount); break;
                    case 3:
                        a3.setBalance(a3.getBalance() - ammount); break;
                    case 4:
                        a4.setBalance(a4.getBalance() - ammount); break;
                    case 5:
                        a5.setBalance(a5.getBalance() - ammount); break;
                    case 6:
                        a6.setBalance(a6.getBalance() - ammount); break;
                    case 7:
                        a7.setBalance(a7.getBalance() - ammount); break;
                    case 8:
                        a8.setBalance(a8.getBalance() - ammount); break;
                    case 9:
                        a9.setBalance(a9.getBalance() - ammount); break;
                }
            }
            else if (action == 3) {
                System.out.println("Enter an amount to deposit: ");
                ammount = input.nextInt();
                switch (selectedId) {
                    case 0:
                        a0.setBalance(a0.getBalance() + ammount); break;
                    case 1:
                        a1.setBalance(a1.getBalance() + ammount); break;
                    case 2:
                        a2.setBalance(a2.getBalance() + ammount); break;
                    case 3:
                        a3.setBalance(a3.getBalance() + ammount); break;
                    case 4:
                        a4.setBalance(a4.getBalance() + ammount); break;
                    case 5:
                        a5.setBalance(a5.getBalance() + ammount); break;
                    case 6:
                        a6.setBalance(a6.getBalance() + ammount); break;
                    case 7:
                        a7.setBalance(a7.getBalance() + ammount); break;
                    case 8:
                        a8.setBalance(a8.getBalance() + ammount); break;
                    case 9:
                        a9.setBalance(a9.getBalance() + ammount); break;
                }
            } else if (action == 4) {
                selectedId = -1;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }

}
