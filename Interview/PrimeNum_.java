/*
 Determine whether a number is prime (a prime number has only two factors: 1 and itself).
 */
public class PrimeNum_ {
    public static void main(String args[]){
        int limit = 100;
        System.out.println("Output");
        for(int num=2;num<=limit;num++){
            if(isPrime(num)){
                System.out.print(num+ " ");
            }     
        }
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
