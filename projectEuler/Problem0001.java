public class Problem0001 {
    public static void main(String[] args){
        // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
        // The sum of these multiples is 23.
        // Find the sum of all the multiples of 3 or 5 below 1000.
        System.out.println(allMultiple(1000));
    }

    public static boolean multipleOfX(int val, int x) {
        // if (val%3==0){
        //     return true;
        // }
        // return false;
        return val%x==0 ? true : false ;
    }

    public static int allMultiple(int max) {
        int sum = 0;
        for (int i = 0 ; i < max ; i++){ 
            if (multipleOfX(i, 3) || multipleOfX(i, 5)){
                sum += i;
            }
        }
        return sum;
    }
}