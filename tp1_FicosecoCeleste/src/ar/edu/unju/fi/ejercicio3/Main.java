package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero:");
		int n = scanner.nextInt();
		
		if (Math.floorMod(n, 2) == 0){
			System.out.println(n*3);
		}else {
			System.out.println(n*2);
		}
		
		scanner.close();
	}

}
