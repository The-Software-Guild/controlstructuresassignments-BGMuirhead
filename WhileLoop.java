
public class WhileLoop {

    public static void main(String[] args) {
        int input = 101101;

        String[] arr = String.valueOf(input).split("");

        int startPos=0;
        while(startPos<arr.length/2)
        {
            if(arr[startPos].equals(arr[arr.length-startPos-1]))
            {
                startPos++;
            }
            else{
                System.out.println(input+ " is not a palindrome");
                return;
            }
        }
        System.out.println(input+ " is a palindrome");










    }

}
