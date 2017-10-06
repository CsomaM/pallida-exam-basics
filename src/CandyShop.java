public class CandyShop {

    static int sugarAmount;
    static String CANDY = "candy";
    static String LOLLIPOP = "lollipop";
    static int lollipopAmount = 0;
    static int candyAmount = 0;
    static int income = 0;
    static int plusMoney = 0;

    public CandyShop (int sugar) {
        this.sugarAmount = sugar;
    }

    static void createSweets (String s) {
        if (s.equals("candy")) {
            candy();
        } else if (s.equals("lollipop")){
            lollipop();
        }
    }

    static void sell (String s, int amount) {
        if (s.equals("candy")) {
            candyAmount --;
            income += 20 + plusMoney;
        } else if (s.equals("lollipop")){
            lollipopAmount --;
            income += 10 + plusMoney;
        }
    }

    static void raise (int amount) {
        plusMoney += amount;
    }

    static void buySugar (int amount) {
        income -= amount*0.1;
        sugarAmount += amount;
    }

    static void candy () {
        sugarAmount -= 10;
        candyAmount ++;
    }

    static void lollipop () {
        sugarAmount -= 5;
        lollipopAmount ++;
    }

    public String toString () {
        return "Invertory: " + candyAmount + " candies " + lollipopAmount + " lollipops, Income: " + income + " Sugar: " + sugarAmount;
    }
}
