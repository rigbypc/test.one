package strange.math;

import java.lang.Math;

public class StrangeMath {
	
	public static double strangeFunction(double value) {
		if(value <= 0) {
			value *= -1.324;
		}
		
		return Math.sqrt(value);
	}
}

