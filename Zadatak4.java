package zadaci;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int d = 14; 	// dan
		int m = 7;		// mjesec
		int g = 1999;	//godina
		
		
		
		if((m==1 || m==3 || m==5 || m==7 || m==8|| m==10 || m==12)&&(d>31)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if((m==4 || m==6 || m==9 || m==11)&&(d>30)) {
			System.out.println("unesena vrijednost ne postoji");
		}else if((g%4==0) && (m==2) && (d>29)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if((g%4!=0) && (m==2) && (d>28)) {
			System.out.println("Unesena vrijednost ne postoji");
		}else if (m>12)  {
			System.out.println("unesena vrijednost ne postoji");
		}else if ((m==3 && d>=21) || (m==4 && d<=20)) {
			System.out.println("Horoskopski znak je OVAN");
		}else if ((m==4 && d>=21) || (m==5 && d<=20)) {
			System.out.println("Horoskopski znak je BIK");
		}else if ((m==5 && d>=21) || (m==6 && d<=20)) {
			System.out.println("Horoskopski znak je BLIZANCI");
		}else if ((m==6 && d>=21) || (m==7 && d<=22)) {
			System.out.println("Horoskopski znak je RAK");
		}else if ((m==7 && d>=23) || (m==8 && d<=22)) {
			System.out.println("Horoskopski znak je LAV");
		}else if ((m==8 && d>=23) || (m==9 && d<=22)) {
			System.out.println("Horoskopski znak je DJEVICA");
		}else if ((m==9 && d>=23) || (m==10 && d<=22)) {
			System.out.println("Horoskopski znak je VAGA");
		}else if ((m==10 && d>=23) || (m==11 && d<=22)) {
			System.out.println("Horoskopski znak je SKORPIJA");
		}else if ((m==11 && d>=23) || (m==12 && d<=21)) {
			System.out.println("Horoskopski znak je STRIJELAC");
		}else if ((m==12 && d>=22) || (m==1 && d<=19)) {
			System.out.println("Horoskopski znak je JARAC");
		}else if ((m==1 && d>=20) || (m==2 && d<=19)) {
			System.out.println("Horoskopski znak je VODOLIJA");
		}else if ((m==2 && d>=20) || (m==3 && d<=20)) {
			System.out.println("Horoskopski znak je RIBE");
		}else if (d<1 || m<1) {
			System.out.println("Unesena vrijednost ne postoji");
		}
		
		
		
		
	}

}
