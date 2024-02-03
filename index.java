public class index{
	
	public static int recursive_sum(int x) {
		if(x > 0) {
			return x + recursive_sum(x-1);
		}
		else {
			return 0;
		}
	}
	
	public static void bubble_sort(int[] arr) {
		int len = arr.length;
		int swap = 0;
		for(int i =0; i< len ; ++i) {
			for(int j =1; j< (len-i); ++j) {
				if(arr[j-1] > arr[j]) {
					swap = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = swap;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(String.format("Recursive sum of 19: %d", recursive_sum(19)));
		System.out.println();
		int arr[] = {1,10,2,4,3,9,8,5,6,7};
		System.out.println("Array before being sorted: ");
		System.out.println();
		for(int i =0; i< arr.length; ++i) {
			System.out.println(arr[i]);
		}
		System.out.println();
		bubble_sort(arr);
		System.out.println("Post bubble sort: ");
		System.out.println();
		for(int x = 0; x < arr.length; ++x) {
			System.out.println(arr[x]);
		}
		System.out.println();
	}
	
}