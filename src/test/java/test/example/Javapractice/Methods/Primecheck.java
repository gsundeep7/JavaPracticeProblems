package test.example.Javapractice.Methods;

//**Write a method to check if a number is prime.**
//   * Parameter: `int num`
//   * Return type: `boolean`

public class Primecheck {

    public boolean prime(int num)
    {
        if(num<=1)  // 0 & 1 are not primes
        {
            return false;
        }

        for(int i=2; i<= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;     //divisible by i(other numbers), so not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Primecheck obj = new Primecheck();
        boolean result = obj.prime(24);
        System.out.println("Given number is prime - " + result);


    }
}
