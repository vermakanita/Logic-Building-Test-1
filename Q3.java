package question;

public class Q3 {
    public static void main(String[] args) {
        int rem=0;
          
        System.out.println("l");

    
    for(int i=100;i<=200;i++){
          int num=i;
          int rev=0;
         while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;


         }
             if(i==rev){
                System.out.println(i);
             }

        

    }
 
 
}
}
