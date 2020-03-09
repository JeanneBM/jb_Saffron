package pattern;

import java.io.*;

public class Plik {
  //  String filePath = "D:/IT/JAVA/Mallorca/url.txt";

         public static void main (String args[])
                throws IOException
        {

                    File file = new File("D:/IT/JAVA/Mallorca/url.txt");
                    if(!file.exists()) {
                        file.createNewFile();
                    }
            FileWriter fw = new FileWriter("D:/IT/JAVA/Mallorca/url.txt");
            fw.write("tresc");
            fw.close();
            // czytanie pliku
            FileReader fr = new FileReader("D:/IT/JAVA/Mallorca/url.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;

             while((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
            fr.close();
        }
    }
