import java.util.Arrays;

public class binarySearch {

    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length -1;
        while(low <= high){
            int middle = (low + high)/2;
            int val = array[middle];
            System.out.println("Middle: " + val);
            if(val < target){
                low = middle + 1;
            }
            else if(val > target){
                high = middle -1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int array[] = new int[300];
        int target = 123;
        for(int i=0; i< array.length; ++i){
            array[i] = i;
        }
        int index = Arrays.binarySearch(array, target);
        if(index == -1){
            System.out.println(target + " not found.");
        }
        else{
            System.out.println("Element found at: " + index);
        }
    }
}
