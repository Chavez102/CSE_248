package temperatureconversion;
/**
 * The Temperature Conversion Java application prints a table
 * converting Celsius to Fahrehheit degrees
 * 
 * 
 * @sea <A HREF="../TemperatureConversion.java> Java Source  Code </A>
 * @author bryan
 *@author bryan <A HREF="mailto.chavb68@sunysuffolk.edu"> chenb@sunysuffolk.edu</A>
 */

public class TemperatureConverstion {
	
	/**
	 * The main method prints a Celsius to Farenheit conversion table.
	 * The bounds of the table range from -50C to +50C in 10 degree increments 
	 * @param args,not used in this application
	 */

	public static void main(String[] args) {
		final double Table_begin= -50.0;
		final double Table_end =50.0;
		final double Table_step=10.0;
		
		double celsius;
		double farenheit;
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("--------------------------");
		System.out.println("Celcius Farenheit");
		
		for (celsius=Table_begin;celsius<=Table_end ; celsius +=Table_step) {
			farenheit=celciusTOFarenheit(celsius);
			System.out.println();
			
		}
		

	}
	
	/**
	 * Convert a temperature from celsius degrees to Farenheit degrees
	 * 
	 * @param c
	 * 			a temperature in celsius degrees
	 * @return 
	 * 			the temperature c converted to Fahrenheit
	 * 			c>=-273.16
	 * 
	 * 
	 * @return
	 */

	private static double celciusTOFarenheit(double c) {
		final double MINIMUM_CELSIUS=-273.16;
		if(c<MINIMUM_CELSIUS)
			throw new IllegalArgumentException("Argument "+c+" is too small");
	
		return 0;
	}

}
