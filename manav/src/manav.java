import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double armut = 2.14;
		double elma = 3.67; 
		double domates = 1.11;
		double muz = 0.95;
		double patl�can = 5.00;
		double ar, el, dom, mu, pa;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Armut ka� kilo? ");
		ar=input.nextDouble();
		System.out.print("Elma ka� kilo? ");
		el=input.nextDouble();
		System.out.print("Domates ka� kilo? ");
		dom=input.nextDouble();
		System.out.print("Muz ka� kilo? ");
		mu=input.nextDouble();
		System.out.print("Patlican ka� kilo? ");
		pa=input.nextDouble();
		
		double top=(armut*ar)+(elma*el)+(domates*dom)+(muz*mu)+(patl�can*pa);
		
		System.out.print("Toplam tutar: ");
		System.out.println(top + " TL");
	}

}
