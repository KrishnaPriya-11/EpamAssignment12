import java.util.*; 
import java.util.stream.IntStream; 

public class EPAMQ1 { 

	public static void main(String[] args) 
	{ 

		IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8); 

		OptionalDouble ob = stream.average(); 

		if (ob.isPresent()) { 
			System.out.println(ob.getAsDouble()); 
		} 
		else { 
			System.out.println("-1"); 
		} 
	} 
} 
