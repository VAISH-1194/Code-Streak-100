// Method 1

import java.util.*;

public class Main {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
     
    String p = sc.nextLine();
	   String q[] = p.split(" ");
     
    int n = Integer.parseInt(q[0]);
    int t = Integer.parseInt(q[1]);
     
    String r = sc.nextLine();
    int len = r.length();
     
      for(int i=0;i<t;i++) 
      {
	       for(int j=0;j<(len-1);j++) {
	         
	         if((r.charAt(j)=='B')&&(r.charAt(j+1)=='G')) {
							               
							 char[] myNameChars = r.toCharArray();
							 
                myNameChars[j] = 'G';
								myNameChars[j+1]='B';
                r = String.valueOf(myNameChars);
										  j++;
								}
							}
						}
						
		    System.out.println(r);
		    
			}
		}
		
		
		
		// Method 2
		
		
		import java.util.*;
		import java.io.*;
		
		public class Main
		{
		  public static void main(String[] args) throws IOException
		  {
		    Scanner sc = new Scanner(System.in);
		    
		    // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		    
		    int n = sc.nextInt();
		    int t = sc.nextInt();
		    
		    String s = sc.next();
		    
		    // String s = input.readLine();
		    
		    StringBuffer res = new StringBuffer();
	      while(t-- != 0)
	      {
	        int i = 0;
	        
	        while(i<s.length() - 1)
	        {
  	          if(s.charAt(i) == 'B' && s.charAt(i+1) == 'G') 
  	          {
      	          res.append("GB");
      	          i++;
  	          }
  	          else
  	          {
  	            res.append(s.charAt(i));
  	          }
  	          
  	          i++;
	        }
	      }
	      
	      System.out.println(res);
		  }
		}