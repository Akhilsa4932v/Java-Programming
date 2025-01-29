//best time to sell the stocks

public class stocks {
    
    public static int Stocks(int stockprice[]){

        int buyprice = Integer.MAX_VALUE;
        int sellprice = Integer.MIN_VALUE;

        int maxprofit = 0;

        for(int i=0;i<stockprice.length;i++){
            
            if(buyprice<stockprice[i]){
                if(stockprice[i] > sellprice){
                    sellprice = stockprice[i];
                }
                int profit = stockprice[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice = stockprice[i];
            }
        }
        System.out.println("buyprice: " +buyprice);
        System.out.println("sellPrice : "+sellprice);
        return maxprofit;
}
    public static void main(String[] args) {
        int stockprice[] = {7,1,5,3,6,4};
        System.out.println(Stocks(stockprice));
    }
}
