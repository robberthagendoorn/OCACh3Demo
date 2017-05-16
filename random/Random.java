package random;

import java.util.*;
import java.time.*;
import java.time.format.*;


public class Random {
	public double getRandom() {
		long nano = System.nanoTime();
		StringBuilder s = new StringBuilder(Long.toString(nano));
		s.delete(0, s.length() - 3).insert(0,"0.");
		double result = Double.parseDouble(s.toString());
		return result;
	}
}
