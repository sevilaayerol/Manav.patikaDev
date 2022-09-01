import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double armut = 2.14;
		double elma = 3.67; 
		double domates = 1.11;
		double muz = 0.95;
		double patlýcan = 5.00;
		double ar, el, dom, mu, pa;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Armut kaç kilo? ");
		ar=input.nextDouble();
		System.out.print("Elma kaç kilo? ");
		el=input.nextDouble();
		System.out.print("Domates kaç kilo? ");
		dom=input.nextDouble();
		System.out.print("Muz kaç kilo? ");
		mu=input.nextDouble();
		System.out.print("Patlican kaç kilo? ");
		pa=input.nextDouble();
		
		double top=(armut*ar)+(elma*el)+(domates*dom)+(muz*mu)+(patlýcan*pa);
		
		System.out.print("Toplam tutar: ");
		System.out.println(top + " TL");
	}

}
