
public class ForLoopTest {

    public static void main(String[] args) {

        //works for input<21

        int input = 10;
        long sum=1;

        for(int i=1;i<=input;i++ )
        {
            sum*=i;
        }

        System.out.println(input + "! = " + sum);



    }

}
