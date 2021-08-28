import java.util.Scanner;

class account {
    private int accountnumber;
    private String name;
    private String adress;
    private String phone;
    public long balance;

    public account() {

    }

    public account(int x, String a, String b, String c) {
        accountnumber = x;
        name = a;
        adress = b;
        phone = c;
    }

    public int getaccountnumber() {
        return accountnumber;
    }

    public void setbalance(long b) {
        balance = b;
    }

    public long getbalance() {
        return balance;
    }

    public String getname() {
        return name;
    }

    public String getadress() {
        return adress;
    }

    public String getphone() {
        return phone;
    }
}

class savingsaccount extends account {
    public void deposit(long add) {
        balance = balance + add;
    }

    public void withdraw(long withd) {
        balance = balance - withd;
    }

}

class loanaccount extends account {
    public int loan;

    public void paypart(int amount) {
        loan = loan - amount;
    }

    public int loanbalance() {
        return loan;
    }
}

class bank {
    public static void main(String[] args) {
        String a, b, c;
        int x;
        Scanner s = new Scanner(System.in);
        System.out.println("Give account account number,name,adress,phone");
        x = s.nextInt();
        a = s.next();
        b = s.next();
        c = s.next();

        account f = new account(x, a, b, c);
        System.out.print("can u give the balance of new account");
        f.setbalance(s.nextLong());
        System.out.print("the account of " + f.getname() + " have balance of:" + f.balance);
        s.close();
    }

}