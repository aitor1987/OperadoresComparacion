import java.util.Scanner;

public class Comparacion {

public static void main(String[] ar) {

int edad;
		Scanner sc = new Scanner(System.in);


		System.out.println("\nIntroduce tu edad");


		edad = sc.nextInt();


		if (edad < 18){
                System.out.println("No eres mayor de edad.\n");
        	}

		if (edad >= 18){
                System.out.println("eres mayor de edad.\n");
        	}
      
}
}

