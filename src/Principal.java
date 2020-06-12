import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Principal extends ManipuladorArquivo {
	 
    public static void main(String [] args ) throws IOException  {
    	
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
        int arraySize = lista.size();
    	long[] valores = new long[arraySize];
    	for (int i = 0; i < lista.size(); i++) {
    		
    		long number = Long.parseLong(lista.get(i));
    		
    		valores[i] = number;
    	}
    	
    	Date dtInicio = new Date();
    	
    	Ordenacao ordenar;
    	
    	ordenar = new Ordenacao(valores);
    	
    	
    	switch (option) {
        case 1:        	
        	ordenar = new InsertionSort(valores);       	
        	break;           	
        case 2:        
        	ordenar = new QuickSort(valores);        	
                break;                
        case 3:       
        	ordenar = new BubbleSort(valores);        	
                break;                             
        default:
        	
        System.out.println("Opção inválida!");
    	
    	}
    	
    	ordenar.Ordenar();
    	Date dtFim = new Date();
    	long tempoExecucao = dtFim.getTime() - dtInicio.getTime();
    	ordenar.printArray(arraySize);
        System.out.println("O tempo de executação foi: " + tempoExecucao + "ms");
    	
    	tc.close();    
    }
 
}