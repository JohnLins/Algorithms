class SelectionSort {
	public static void main(String[] args){
		int[] arr = {6, 7, 1, 9, 5, 2};
		int minIndex = 0;
		int temp;
		int min;		
		for(int i = 0; i < arr.length; i++){
			min = arr[i];
			for(int j = i; j < arr.length; j++){
				if(arr[j] < min) {
					min = arr[j];
					System.out.println(min);
					minIndex = j;
				}

			}
		
		System.out.println();
		for(int k = 0; k < arr.length; k++){System.out.print(arr[k] + " ");}
		temp = arr[i];
		arr[i] = min;
		arr[minIndex] = temp;
		}
	}
}


