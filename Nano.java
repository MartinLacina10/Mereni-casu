import java.util.concurrent.TimeUnit;

import java.util.*;
public class Nano{
    	public static void main(String[] args) throws InterruptedException {

		long startTime = System.nanoTime();

		int a = 0;
                int b = 0;
                int c = 1;

                while(b <= 1000){

                a = b;
                b = c;
                c = a + b;
                System.out.print(a + " ");
}
		
		
                System.out.print("= ");                

		

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Vysledek v nanosekundach: " + timeElapsed);
	}
}