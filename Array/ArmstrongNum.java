package Array;

// the number of digits * 1st number + number of digits * the 2nd number + number of digits * 3rd number ... 
// the sum of all of these digits if equals to the number itself then it said to be the armstrong number
public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 155,rem,sum = 0;
        int n = 0;
        int temp = num;
        while(num != 0){
            num /= 10;
            n++;
        }
        num = temp;
        while(num != 0){
            rem = num % 10;
            sum += Math.pow(rem,n);
            num /= 10;
        }
        if(temp == sum){
            System.out.println("number is Armstrong ");
        }
        else {
            System.out.println("number is not armstrong ");
        }
    }
}
