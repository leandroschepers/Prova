public class BubbleSort extends Ordenacao {
	
public BubbleSort (long a[]) {
	
	super(a);
	
}
	
	 public void Ordenar(){
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
	 


}