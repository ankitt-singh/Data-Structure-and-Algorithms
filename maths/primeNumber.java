
public class primeNumber {
    public static void main(String[] args){
        int n = 61;
        int count = 0;
        // for(int i = 1; i <= n; i++)
        // {
        //     if(n % i == 0)
        //     {
        //         count++;
        //     }
        // }

        // if(count > 2)
        // {
        //     System.out.println("Number is not prime number");
        // }
        // else{
        //     System.out.println("Number is prime number");
        // }

        for(int i = 1; i*i <= n; i++)
        {
            if(n%i == 0)
            {
                count++;
                if(n/i != i)
                {
                    count++;
                }
            }
        }
        if(count > 2)
        {
            System.out.println("Number is not prime number");
        }
        else{
            System.out.println("Number is prime number");
        }
            
        
    }
}
