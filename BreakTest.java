

public class BreakTest {

    public static void main(String[] args) {
        
    	int counter =0;
        System.out.print("Primes: ");


        for(int i=2; i<=100; i++)
        {
            boolean isPrime = true;
            for(int j=2;j<Math.sqrt(100)+1;j++)
            {

                if(j<i && i%j ==0)
                {
                    isPrime =false;
                    break;
                }
            }
            if(isPrime)
            {
                counter ++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Total: " + counter);



    }

}
