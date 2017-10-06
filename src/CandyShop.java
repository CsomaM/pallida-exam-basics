public class CandyShop {

    static int sugarAmount;
    static int lollipopAmount = 0;
    static int candyAmount = 0;
    static int income = 0;
    static int plusMoney = 0;
    static Candy CANDY = new Candy();;
    static Lollipop LOLLIPOP = new Lollipop();

    public CandyShop (int sugar) {
        this.sugarAmount = sugar;
    }

    static void createSweets (CandyShop c) {
        if (c instanceof Candy) {
            sugarAmount -= Candy.cost;
            candyAmount++;
        } else if (c instanceof Lollipop){
            sugarAmount -= Lollipop.cost;
            lollipopAmount++;
        }
    }

    static void sell (CandyShop c, int amount) {
        if (c instanceof Candy) {
            candyAmount --;
            income += 20 + plusMoney;
        } else if (c instanceof Lollipop){
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

    public String toString () {
        return "Inventory: " + candyAmount + " candies " + lollipopAmount + " lollipops, Income: " + income + " Sugar: " + sugarAmount;
    }

}
