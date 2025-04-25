package Array;

// buy and sell the stock on the best profit
public class BuyAndSell {

    static int buy(int price[]){
        int mini = price[0];
        int maxProfit = 0;
        for(int i = 1; i < price.length; i++){
            // i want max profit so that to find the cost we will using the cost = currentprice - mini(mini price in the array)
            int cost = price[i] - mini;
            maxProfit = Integer.max(maxProfit, cost);
            mini = Integer.min(mini, price[i]);
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int arr[] = {7,1,3,5,6,4};
        System.out.print(buy(arr) + " max profit");
    }
}
