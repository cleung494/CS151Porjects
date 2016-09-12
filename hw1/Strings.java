public class Strings
{
   public static String uniqueLetters(String str)
   {
      if (str.length() <= 1) { return str; }
      String ret = "";
      String lowerCase = str.toLowerCase();
      char[] characters = lowerCase.toCharArray();
      for (int i = 0;  i < characters.length; i++)
      {
           int count = 0;
                 char c = characters[i]; 
                 for (int j = 0; j < characters.length; j++)
                 { if (c == characters[j] && i!=j) { count++; } }
           if (count == 0) { ret += c; }
      }
     return ret;
   }
}
