import java.util.*; 
import java.util.stream.*; 
class EPAMQ3 { 
	public static void main(String[] args) 
	{ 
	    String a[]={"aba","abcde","malayalam","anu","hwh","eurcd","tit"};
	    Stream<String> streamOfArray = Arrays.stream(a); 
        Iterator<String> it = streamOfArray.iterator(); 
        while (it.hasNext())
        { 
            String str=it.next();
            if(isPalindrome(str))
            System.out.println(str);
        }
	} 
	public static boolean isPalindrome(String input)
	{
        String temp = input.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, input.length() / 2)
            .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
        }
}  