import java.math.BigDecimal;

public class CatchNumber{
	public static double add(double v1,double v2){

	BigDecimal b1 = new
	BigDecimal(Double.toString(v1));

	BigDecimal b2 = new
	BigDecimal(Double.toString(v2));

	return b1.add(b2).doubleValue();
	}
}
