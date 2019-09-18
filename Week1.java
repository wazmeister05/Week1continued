public class Week1 {

    public static void isMultiple(long n, long m){

        boolean divisible = false;
        if(n%m == 0){
            divisible = true;
        }
        System.out.println(divisible);
    }

    public static void isOdd(int n){
        boolean oddOrEven = false; //initial value 0 = false, so 1 = true
        for (int i = 1; i <= n; i++){
            oddOrEven = !oddOrEven; //!false = true
        }
        System.out.println(oddOrEven);
    }

}
