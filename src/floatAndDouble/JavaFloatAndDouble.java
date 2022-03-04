package floatAndDouble;
public class JavaFloatAndDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value = " + myMinFloatValue);
        System.out.println("Max Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value = " + myMinDoubleValue);
        System.out.println("Max Double Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFLoatValue = 5F /  3F;
        double myDoubleValue = 5D / 3F;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFLoatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200D;
        double convertedKillograms = numberOfPounds * 0.45359237D;
        System.out.println("In Killogram = " + convertedKillograms);

    }
}
