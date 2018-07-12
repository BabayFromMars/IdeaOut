package lesson2505;

public class Bank {
    String title;

    public Bank(String title) {
        this.title = title;
    }

    class Account {
        int accountNumber;
        double accountBalance;

        public Account(int accountNumber, double accountBalance) {
            this.accountNumber = accountNumber;
            this.accountBalance = accountBalance;
        }


        void setMoney(double money) {
            if (money > 0) {
                accountBalance += money;
            }
        }
        void getMoney (double money){
            if(money < accountBalance){
                accountBalance -=money;
            }
        }
        void show(){
            System.out.printf("Bank - %s, account number - %d, balance - %g",
                    title, accountNumber, accountBalance);
            System.out.println();
        }
    }
}
