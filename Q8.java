package question;

public class Q8 {
    public static void main(String args[]){
        int n=1234;
        int c=n;
        int rev=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev = rev*10+rem;
            n=n/10;

        }
        System.out.println(rev);
        
        // if(c==rev){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

    }
    
}
