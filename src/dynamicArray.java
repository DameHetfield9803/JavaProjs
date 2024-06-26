public class dynamicArray{
    int size;
    int capacity = 10;
    Object[] array;

    public dynamicArray(){
        this.array = new Object[capacity];
    }
    public dynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        ++size;

    }
    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i =size; i> index; --i){
            array[i] = array[i-1];
        }
        array[index] = data;
        ++size;
    }
    public void delete(Object data){
        for(int i =0 ; i< size; ++i){
            if(array[i] == data){
                for(int j =0; j < (size -i -1); ++j){
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                --size;
                if(size <=(int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data){
        for(int i =0; i< size; ++i){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void shrink(){

    }
    public void grow(){
        int newcap = (int) (capacity * 2);
        Object[] newArr = new Object[newcap];
        for(int i =0; i<size ; ++i){
            newArr[i] = array[i];
        }
        capacity = newcap;
        array = newArr;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        String string = "";
        for(int i=0; i< capacity; ++i){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() -2) + "]";
        }
        else{
            string = "[]";
        }
        return string;
    }
}
