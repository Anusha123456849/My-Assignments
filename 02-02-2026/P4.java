import java.util.*;

class P4{
    public static void main(String[] args) {

        String[] inputs = {"10", "20.5", "abc", "30"};

        List<Number> list = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (s.contains(".")) {
                    list.add(Double.parseDouble(s));
                } else {
                    list.add(Integer.parseInt(s));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + s);
            }
        }

        int intSum = 0;
        double doubleSum = 0;
        int doubleCount = 0;

        for (Number n : list) {
            if (n instanceof Integer) {
                intSum += n.intValue();
            } else if (n instanceof Double) {
                doubleSum += n.doubleValue();
                doubleCount++;
            }
        }

        System.out.println("Integer Sum = " + intSum);
        System.out.println("Double Average = " + (doubleSum / doubleCount));
    }
}
