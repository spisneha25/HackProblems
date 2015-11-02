import java.util.HashMap;


public class substring 
{

	public String longestSubstr(String s, int N)
	{
	    if(s == null || s.length() == 0)
	        return null;

	    int len = s.length();
	    
	    int glen = 0, clen = 0, gst = 0, gend = 0, uniq = 0;
	    int ch = 1;
	    int i, j = 0;
	    
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	    for(i = 0; i < len;)
	    {
	        clen = 0;
	        uniq = 0;
	        map = new HashMap<Character, Integer>();
	        j = i;
	        while(j < len) 
			{
			    char c = s.charAt(j);
		
			    if(!map.containsKey(c))
			    {
			        uniq++;
			        
			        if(uniq == N + 1)
			        	break;
			        
			        if(uniq == 2)
			        {
			            ch = j;
			        }
			        
			        map.put(c, j);
			    }
			    else if(c == s.charAt(i))
			    {
			    	map.put(c, j);
			    }

			    clen++;
			    j++;
			}
			
			if(glen < clen)
			{
			    glen = clen;
			    gst = i;
			    gend = j;
			}
			
			if(uniq == N + 1)
			{
				i = map.get(s.charAt(i)) + 1;
			}
			
			else
				i++;
		}

	    return s.substring(gst, gend);
	        
	}
	
	public static void main(String args[])
	{
		substring s = new substring();
		System.out.println(s.longestSubstr("abababababcababababzzzzzz", 3));
	}

}
