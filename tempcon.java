public class tempcon1{
  public static void main (String[] args){
		String src = args[0];
		String tar = args[1];
		int val = Integer.parseInt(args[2]);
		if (src.equals("Cel") && tar.equals("Kel")){
			double CK = val+273.15;
			System.out.println(val+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+CK+" "+"Kelvin");
		}
		else if (src.equals("Kel") && tar.equals("Cel")){
			double KC= val-273.15;
			System.out.println(val+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+KC+" "+"Celcius");
		}
		else if (src.equals("Cel") && tar.equals("Far")){
			double CF = (val*9/5)+32;
			System.out.println(val+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+CF+" "+"Fahrenheit");
		}
		else if (src.equals("Far") && tar.equals("Cel")){
			double FC = (val-32)*5/9;
			System.out.println(val+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+FC+" "+"Celcius");
		}
		else if (src.equals("Far") && tar.equals("Kel")){
			double FK = (val-32)*5/9+273.15;
			System.out.println(val+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+FK+" "+"Kelvin");
		}
		else if (src.equals("Kel") && tar.equals("Far")){
			double KF = (val-273.15)*9/5+32;
			System.out.println(val+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+KF+" "+"Fahrenheit");
		}
	}
}
