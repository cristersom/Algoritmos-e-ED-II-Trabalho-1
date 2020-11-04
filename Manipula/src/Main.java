import java.io.*;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//import java.util.SortedMap;
//import java.util.TreeMap;

class Main {

    private static final String VIRGULA = ";";

    public static void main(String[] args) throws Exception {
    	//TREEMAP
    	//TreeMap tm1 = new TreeMap(); 
    	
    	//HASHMAP
    	Map<Integer, String[]> example = new HashMap<Integer, String[]>();	
    	
    	int  i = 1;
    	
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("dados_latin.csv")));
    	 //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("dados_utf8.csv")));
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            String[] dadosUsuario = linha.split(VIRGULA);
            
           // System.out.println(Arrays.toString(dadosUsuario));
          //  System.out.println("Dado 1: " + dadosUsuario[0]);
          //  System.out.println("Dado 2: " + dadosUsuario[1]);
          //  System.out.println("Dado 3: " + dadosUsuario[2]);
          //  System.out.println("Dado 4: " + dadosUsuario[3]);
          //  System.out.println("Dado 5: " + dadosUsuario[4]);
          //  System.out.println("Dado 6: " + dadosUsuario[5]);
          //  System.out.println("--------------------------");
            
            // TREEMAP
           // tm1.put (i, dadosUsuario);
            
            //HASHMAP
            example.put (i, dadosUsuario);
            i++;
        }
        
        // TreeMap
       // System.out.println(tm1 ); 
        
        //HashMap
        int keyToSearch = 1;
        if ( example.containsKey( keyToSearch ) ) {
         System.out.println("Valor da Chave "+keyToSearch+
          " = "+example.get(keyToSearch));
        }else{
               System.err.println("Chave não existe");
        }
        
       // System.out.println(example);
        reader.close();
        

    }
}