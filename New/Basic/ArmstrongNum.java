public class ArmstrongNum {
    public static void main(String args[]){
        int num = 153;
        int temp = num;
        int k = 0;
        while(temp > 0){
            temp /= 10;
            k++;
        }
        int sum = 0;
        temp = num;
        while(temp > 0){
            int digit = temp % 10;
            // sum += Math.pow(digit,k);
            sum += pow(digit, k);
            temp /= 10;
        }

        // int m = pow(3,3);
        // System.out.println(m);
        if(sum == num)
            System.out.println("Number is Armstrong ");
        else
            System.out.println("Number is not Armstrong");
        
        
    }

    public static int pow(int digit,int power){
        int mul = 1;
        for(int i = 1; i <= power;i++){
            mul *= digit;
        }
        return mul;
    }


    
}