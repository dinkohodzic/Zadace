package zadaci;
/*Napisati program koji sadrži tri cijela broja a, b i c. 
 * Ispisati da li je moguće konstruisati
trougao sa stranicama vrijednosti a, b i c.*/
public class Zadatak1 {

	public static void main(String[] args) {
		int a = 2;   //Stranica "a" trougla
		int b = 4;	 //Stranica "b" trougla
		int c = 1;	 //Stranica "c" trougla ili hipotenuza
		
		boolean trougao = ((a*a)+(b*b))==(c*c); //pitagorina teorema
		
		System.out.println(trougao);

	}

}
