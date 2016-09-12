
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      String str = "";
      for(int i  = 0; i < m; i++)
      {
          str += ".";
      }
      for (int j=0; j < n; j++)
      {
          str += "-";
      }    
      strMaker(result, str);
      return result;
   }
   public static void strMaker(Set<String>r, String str)
   {
     recMaker("",str, r);
   }
   public static void recMaker(String prefix, String str, Set<String> r)
   {
     int n = str.length();
     if (n == 0) { r.add(prefix); }
     else {
             for (int i = 0; i < n; i++)
            recMaker(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), r);
    } 
} 
   
}
