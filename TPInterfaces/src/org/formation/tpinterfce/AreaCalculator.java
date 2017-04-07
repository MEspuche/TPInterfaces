package org.formation.tpinterfce;

public class AreaCalculator {

	public double sumArea(double[] surfaces)
	{
		double total=0;
		for(int i=0; i<surfaces.length; i++)
		{
			double sum=surfaces[i];
			System.out.println(sum); 
			total+=sum;
		}
		return total;
	}
	
}
