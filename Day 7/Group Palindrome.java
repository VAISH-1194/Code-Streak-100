import java.util.*;

public class Main {
  
    public static List<List<String>> groupPalindrome(String words[])
    {
      Map<String, List<String>> res = new HashMap<>();
      
      for(String word: words)
      {
        String sortWord = sorted(word); 
        res.putIfAbsent(sortWord, new ArrayList<>());
        res.get(sortWord).add(word);
      }
      return new ArrayList<>(res.values());
    }
    
    public static String sorted(String word)
    {
      char s[] = word.toCharArray();
      Arrays.sort(s);
      return new String(s);
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String words[] = new String[n];
      
      for(int i=0;i<n;i++)
        words[i] = sc.next();
      List<List<String>> output = groupPalindrome(words);
      System.out.println(output);
      
  }
}