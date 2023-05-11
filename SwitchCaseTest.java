
public class SwitchCaseTest {

    public static void main(String[] args) {
        
    	
    	char c = 'c'; 

        switch(Character.toLowerCase(c)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println("Character " + c+ " is a vowel");
                break;
            }
            default:
            {
                System.out.println("Character " + c+" is not a vowel");
            }

        }

    }

}
