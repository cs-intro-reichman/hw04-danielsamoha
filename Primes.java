public class Primes {
    public static void main(String[] args) {
        int mone = 0;
        int p = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + p + ":");
        for (int i = 2; i <= p; i++){
            Boolean isprime =true;
            for (int j = 2; j < i && isprime == true; j++){
                if (i % j == 0){
                    isprime = false;
                }
            }
            if (isprime == true){
                System.out.println(i);
                mone++;
            }
        }
        
        int pre = (int)((double)mone / (double)(p) * 100);
        System.out.println("There are " + mone + " primes between 2 and " + p + " (" + pre + "% are primes)");
    }
}