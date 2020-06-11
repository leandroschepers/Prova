import java.io.IOException;
import java.util.Scanner;
 
public class Principal extends ManipuladorArquivo {
 
    public static void main(String args[]) throws IOException {
    	
    	
    	
    	
    	Scanner tc = new Scanner(System.in);
    	
    	System.out.println("Digite o local do arquivo :");
    	String path = tc.nextLine();
        ManipuladorArquivo.leitor(path);
        
        int arraySize = lista.size();
        int option = 0;
        
        System.out.println("Digite o método de ordenamento :");
        System.out.println("1 - Insertion Sort");
        System.out.println("2 - Quick Sort");
        System.out.println("3 - Bubble Sort");
        option = tc.nextInt();
        switch (option) {
        case 1:
        	
        	long[] valores = new long[arraySize];
        	
        	for (int i = 0; i < lista.size(); i++) {
        		
        		long number = Long.parseLong(lista.get(i));
        		
        		valores[i] = number;
        	}
        	
        	InsertionSort.insertionSort(valores);
        	InsertionSort.printArray(valores, arraySize);
        	break;
        case 2:
        	
        	break;
        case 3:
        	long[] valores3 = new long[arraySize];
        	
        	for (int i = 0; i < lista.size(); i++) {
        		
        		long number2 = Long.parseLong(lista.get(i));
        		
        		valores3[i] = number2;
        	}
                BubbleSort.bubbleSort(valores3);
                BubbleSort.printArray(valores3, arraySize);
                break;
        	
        default:
        	System.out.println("Escolha inválida!");
        }
        tc.close();
        
    }
 
}