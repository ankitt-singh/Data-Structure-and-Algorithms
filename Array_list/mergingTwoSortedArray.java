package Array_list;

public class mergingTwoSortedArray {
    public static void main(String[] args){

        int a[] = {1,2,3,0,0,0};
        int b[] = {2,5,6};

        // we create a new array length = sum of length of two arraya

        int p = 3;
        int q = 3;
        int result[] = new int[p + q];

        int i = 0; // starting index of array a
        int j = 0;// starting index of array b
        int k = 0; // starting index of array result

        while( i < p && j < q)
        {
            if( a[i] <= b[j])
            {
                result[k] = a[i];
                i++;
            }
            else if( a[i] >= b[j])
            {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        // when array b finished first
        while(i < p)
        {
            result[k] = a[i];
            k++;
            i++;
        }

        // when array a finished first

        while(j < q)
        {
            result[k] = b[j];
            k++;
            j++;
        }

        for( int f = 0; f < (p + q); f++)
        {
            System.out.print(result[f] + " ");
        }
        
    }
}
