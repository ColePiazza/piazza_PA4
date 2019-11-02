package piazza_p1_;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class DuplicateRemover
{

   ArrayList<String> uniqueWords = new ArrayList<String>();

   public void remove(String fileName) throws IOException {
BufferedReader br1 = new BufferedReader(new FileReader(fileName));
String line1 = br1.readLine();
while(line1 != null)
{
   String temp[] = line1.split(" ");
   for(String i:temp)
   {
       if(!uniqueWords.contains(i))   uniqueWords.add(i);
   }
line1 = br1.readLine();
}

br1.close();
   }

   public void write(String fileName) throws FileNotFoundException {
       PrintWriter pw = new PrintWriter(fileName);
       for(String i:uniqueWords)
       {
       pw.println(i);
   }
       pw.close();
   }
}