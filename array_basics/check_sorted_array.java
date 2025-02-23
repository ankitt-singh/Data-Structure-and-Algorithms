package array_basics;

public class check_sorted_array {
    public static void main(String[] arge){

        int arr[] = {5,10,7,2,0,85,3};

        int sorted = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < arr[i+1]){
                sorted = 0;
            }
        }
        if(sorted == 0){
            System.out.println("Sorted Array:");
        }
        else{
            System.out.println("not Sorted");
        }
    }
}
