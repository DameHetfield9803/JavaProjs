public class bubbleSort {
    public static void main(String[] args){
        int array[] = { 9,213,21,42,1,7,2,8,23213 };
        bubbleSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }
    public static void bubbleSort(int array[]){
        for(int i = 0; i< array.length -1; ++i){
            for(int j=0; j < array.length - i -1; ++j){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
