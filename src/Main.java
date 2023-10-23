import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Long maxLongValue = Long.MAX_VALUE;
        Long minLongValue = Long.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        Short maxShortValue = Short.MAX_VALUE;
        Short minShortValue = Short.MIN_VALUE;
        Byte maxByteValue = Byte.MAX_VALUE;
        Byte minByteValue = Byte.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean checkIfTheNumberFitsAnyOfThem = false;
        List<BigDecimal> bigDecimalList = new ArrayList<BigDecimal>();

        // Consume the newline character left by nextInt()
        input.nextLine();

        for(int i = 0; i < n; i++)
        {
            String enteredValue = input.nextLine();
            BigInteger bigIntValue = new BigInteger(enteredValue);
            bigDecimalList.add(new BigDecimal(bigIntValue));
        }

        for(int i = 0; i < n; i++)
        {
            BigDecimal currentValue = bigDecimalList.get(i);
            if (currentValue.compareTo(new BigDecimal(minLongValue)) >= 0 && currentValue.compareTo(new BigDecimal(maxLongValue)) <= 0) {
                System.out.println(currentValue + " can be fitted in:");
                if (currentValue.compareTo(new BigDecimal(minByteValue)) >= 0 && currentValue.compareTo(new BigDecimal(maxByteValue)) <= 0) {
                    System.out.println("* byte");
                }
                if (currentValue.compareTo(new BigDecimal(minShortValue)) >= 0 && currentValue.compareTo(new BigDecimal(maxShortValue)) <= 0) {
                    System.out.println("* short");
                }
                if (currentValue.compareTo(new BigDecimal(minIntValue)) >= 0 && currentValue.compareTo(new BigDecimal(maxIntValue)) <= 0) {
                    System.out.println("* int");
                }
                if (currentValue.compareTo(new BigDecimal(minLongValue)) >= 0 && currentValue.compareTo(new BigDecimal(maxLongValue)) <= 0) {
                    System.out.println("* long");
                    checkIfTheNumberFitsAnyOfThem = true;
                }
            }
            else{
                System.out.println(currentValue + " can't be fitted anywhere.");
            }
        }
    }
}
