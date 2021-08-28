
class custoumer {
    private String custID;
    private String name;
    private String adress;
    private String phone;

    public custoumer(String a, String x) {
        custID = x;
        name = a;
    }

    public void setadress(String b, String c) {

        adress = b;

    }

    public void setphone(String c) {

        phone = c;
    }

    public String getID() {
        return custID;

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

class product {
    private int itemno;
    private String name;
    private double price;
    private int qty;

    public product(int a, String b, double c, int d) {
        itemno = a;
        name = b;
        price = c;
        qty = d;

    }

    public int getitemno() {
        return itemno;
    }

    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public int getqty() {
        return qty;
    }
}

public class magasin {
    public static void main(String[] args) {

    }

}
