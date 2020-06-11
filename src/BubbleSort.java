public class BubbleSort extends ManipuladorArquivo {
	
	
	 public static void bubbleSort(long[] array){
	        if(array == null){
	            throw new NullPointerException("O array não existe.");
	        }
	        boolean flag = true;
	        for(int i = 0; i < array.length - 1 && flag; i++){
	            flag = false;
	            for(int j = 0; j < array.length - i - 1; j++){
	                if(array[j] > array[j + 1]){
	                	long temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp; 
	                    flag = true;
	                }
	            }
	        }
	    }
	 
	    public static void printArray(long a[], long n){
	        int i;
	        for(i = 0; i < n; i++){
	            System.out.printf("%d, ", a[i]);
	        }
	        System.out.printf("\n");
	    }

}
