/*package pattern;

import java.net.*;        // konieczne do posługiwania się klasą URL
import java.io.*;
import java.util.*;

class URLReader {

    public static void main(String[] args) throws Exception {
        BufferedReader list = new BufferedReader(           // lista URLi z pliku url.txt
                new FileReader("url.txt"));// zapisanych w kolejnych liniach
        String urlString;
        while ((urlString = list.readLine()) != null) {
            readAndSave(new URL(urlString)); // tworzony nowy obiekt klasy URL
        }                                // oznaczający zasób z Sieci
        list.close();
        System.exit(0);

    }

    static void readAndSave(URL url) throws Exception {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        url.openStream()   // zwraca InputStream związany z URLem
                )
        );

        String fname = null;
        StringTokenizer st = new StringTokenizer(
                url.getFile(),    // <- zwraca nazwę pliku dla URLa
                "/"             //odcinamy domene pobieramu uri
        );
        System.out.println(url);
        while (st.hasMoreTokens()) fname = st.nextToken(); // pobieramy nazwę pliku
        // pod którą ma być zachowany
        if(fname == null){
            fname = "index.html";           //jesli fname okaze sie nullem
        }                                  //fname ustawiamy na index.html

        BufferedWriter out = new BufferedWriter(new FileWriter(fname));

        String s;
        while ((s = in.readLine()) != null) {//odczyt ze strumienia i
            out.write(s);                  //zapis do pliku
            out.newLine();
        }
        in.close();      //zamkniecie strumieni
        out.close();
    }

}*/
