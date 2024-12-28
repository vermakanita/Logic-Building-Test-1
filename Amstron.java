public class Amstron {
    public static void main(String[] args) {
        
    

    
int n=10;
int st=0;
int lt=1;
int nt=st+lt;
while(n>0){
    int nt = st+lt;
    System.out.println(nt);
    st=lt;
    lt=nt;
    st++;
    lt++;


}
}}