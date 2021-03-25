public class InsertionSor
{
	public static void main(String[] args) {
	int[] arr = {0, 4, 2, 4};
	
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
 
           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        
        
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
 
        System.out.println();
    }


    ArrayList<Integer> arrList = new ArrayList<Integer>();
	arrList.add(6);
	arrList.add(1);
	arrList.add(2);
	arrList.add(2);
	arrList.add(8);
	
        for (int i = 1; i < arrList.size(); i++) {
            int key = arrList.get(i);
            int j = i - 1;
 
           
            while (j >= 0 && arrList.get(j) > key) {
                arrList.set(j + 1, arrList.get(j));
                j = j - 1;
            }
            arrList.set(j + 1, key);
        }
        
        
        
        for (int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i) + " ");
        }
 
            System.out.println();
    
}
