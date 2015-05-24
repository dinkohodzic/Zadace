package zadaci;
/*Napisati program koji sadrži šest varijabli koje predstavljaju dva datuma.  
 Ispisati na
konzolu datum koji od ta dva datuma dođe prije drugoga.*/

public class Zadatak3 {

	public static void main(String[] args) {
		
		int d1 = 29;
		int m1 = 7;
		int g1 = 2003;
		
		int d2 = 21;
		int m2 = 9;
		int g2 = 2003;
		
		if((m1==1 || m2==1 || m1==3 || m2==3 || m1==5 || m2==5 || m1==7 || m2==7 || m1==8 || m2==8 || m1==10 || m2==10 || m1==12 || m2==12)&&(d1>31 || d2>31)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if((m1==4 || m2==4 || m1==6 || m2==6 || m1==9 || m2==9 || m1==11 || m2==1)&&(d1>30 || d2>30)) {
			System.out.println("unesena vrijednost ne postoji");
		}else if((g1%4==0 || g2%4==0) && (m1==2 || m2==2) && (d1>29 || d2>29)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if((g1%4!=0 || g2%4!=0) && (m1==2 || m2==2) && (d1>28 || d2>28)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if (g1>g2) {
			System.out.println("Datum 2 dolazi prije datuma 1");
		}else if(g2>g1) {
			System.out.println("Datum 1 dolazi prije datuma 2");
		}else if ((g1==g2) && (m1>m2)) {
			System.out.println("Datum 2 dolazi prije datuma 1");
		}else if ((g1==g2) && (m2>m1)) {
			System.out.println("Datum 1 dolazi prije datuma 2");
		}else if ((g1==g2)&&(m1==m2)&&(d1>d2)) {
			System.out.println("Datum 2 dolazi prije datuma 1");
		}else if ((g1==g2)&&(m1==m2)&&(d2>d1)) {
			System.out.println("Datum 1 dolazi prije datuma 2");
		}else if ((g1==g2)&&(m1==m2)&&(d1==d2)) {
			System.out.println("Datumi su isti");
		}else if ((m1>12) || (m2>12)) {
			System.out.println("unesena vrijednost ne postoji");
		}else if((d1<1 || d2<1) ||(m1<1 || m2<1) ) {
			System.out.println("Unesena vrijednost ne postoji");
		}
		
		
		
		
		
		

	}

}
