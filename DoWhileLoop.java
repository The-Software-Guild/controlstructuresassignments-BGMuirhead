
public class DoWhileLoop {

    public static void main(String[] args) {

    	System.out.println("The First 10 Fibonacci Numbers:");

        int i=3;
        int prev2=0;
        int prev1=1;
        System.out.println("1. " + prev2);
        System.out.println("2. " + prev1);
        do {

            int sum =prev2+prev1;
            System.out.println(i + ". "+ sum);
            prev2 = prev1;
            prev1 = sum;
            i++;
        }while(i<11);


    }

}
