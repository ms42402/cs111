public class TwoSmall {
    public static void main(String[] args) {
        double value1 = Double.parseDouble(args[0]);
        double value2 = Double.parseDouble(args[1]);
        double values;
        double values2;
        for (int i = 2; i < args.length;) {
            double value4 = Double.parseDouble(args[i]);
            if (value1 > value2) {
                if (value2 > value4) {
                    values = value4;
                } else {
                values = value2;
                }
            } if (value1 > value4) {
                values2 = value4; 
            } else {
                values2 = value1;
            }
            i++;
            if (values2 < values) {
                double value0 = values;
                values = values2;
                values2 = value0;
            }
        }
            System.out.println(values);
            System.out.println(values2);       
        }
          
}

