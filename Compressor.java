import java.util.*; 
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
      String compresedStr="" ;
      int n = str.length(); 
      for (int i = 0; i < n; i++) { 
            if (!Character.isAlphabetic(str.charAt(i))) {
              return "Not Contain any numbers, puntuation, or sysmbols!";
            }

        // Count occurrences of current character 
        int count = 1; 
        while (i < n - 1 && 
          str.charAt(i) == str.charAt(i + 1)) { 
          count++; 
          i++; 
        } 

        if (count == 1) {
          compresedStr+=("1"+str.charAt(i)); 
        } 
        else {
          compresedStr+=count; 
          compresedStr+=str.charAt(i); 
        }
      }
      return compresedStr;
    }
    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));         
    }

}

