import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class ManipuladorArquivo {
	
	static ArrayList<String> lista = new ArrayList<String>();
	
 
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
        	linha = buffRead.readLine();
            if (linha != null) {
                lista.add(linha);     
            } else
                break;
        }       
        buffRead.close();
    }
}