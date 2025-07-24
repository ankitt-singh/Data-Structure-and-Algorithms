public class demo {
    public static void main(String[] agrs)
    {
        int num = 12345;
        int digitCount = 0;

        num = Math.abs(num);
        
        // couting digit
        if(num == 0)
        {
            digitCount = 1;
        }
        else
        {
            while(num > 0)
            {
                num = num / 10;
                digitCount ++;
            }
        }
        int sum = 0;
        System.out.println(digitCount);
        for(int i = 0; i < digitCount; i++)
        {
            int digit = num % 10;
            sum = sum + ((int)Math.pow(digit,digitCount));
            num = num / 10;
        }

        System.out.println(sum);
    }
}
