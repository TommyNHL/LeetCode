import java.math.BigDecimal;
import java.util.Arrays;

public class Q2469_ConvertTheTemperature {
  public static double[] convertTemperature(double celsius) {
    double[] output_arr = new double[2];
    BigDecimal bd_c = new BigDecimal(celsius);
    BigDecimal k = new BigDecimal(273.15);
    BigDecimal f = new BigDecimal(1.80);
    BigDecimal m = new BigDecimal(32.00);
    output_arr[0] = Math.round(bd_c.add(k).doubleValue() * 100000) / 100000.0;
    output_arr[1] = Math.round(bd_c.multiply(f).add(m).doubleValue() * 100000) / 100000.0;
    return output_arr;
  }
  // ===========================================================================
  public static void main(String[] args) {
    double input1 = 36.50;
    System.out.println(Arrays.toString(convertTemperature(input1)));

    double input2 = 122.11;
    System.out.println(Arrays.toString(convertTemperature(input2)));
  }
}