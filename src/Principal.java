import java.io.IOException;
import java.util.Scanner;
 
public class Principal extends ManipuladorArquivo {
 
    public static void main(String args[]) throws IOException {
    	
    	int option = 0;
    	
    	Scanner tc = new Scanner(System.in);
    	
    	System.out.println("Digite o local do arquivo :");
    	String path = tc.nextLine();
        ManipuladorArquivo.leitor(path);
       
 
        
        System.out.println("Digite o método de ordenamento :");
        System.out.println("1 - Insertion Sort");
        System.out.println("2 - Quick Sort");
        System.out.println("3 - Bubble Sort");
        option = tc.nextInt();
        switch (option) {
        case 1:
        	
        case 2:
        	
        	
        case 3:
        	int arraySize = lista.size();
        	long[] valores = new long[arraySize];
        	
        	for (int i = 0; i < lista.size(); i++) {
        		
        		long number = Long.parseLong(lista.get(i));
        		
        		valores[i] = number;
        	}
                BubbleSort.bubbleSort(valores);
                BubbleSort.printArray(valores, arraySize);
        	
        default:
        }
        tc.close();
        
        
    }
 
}