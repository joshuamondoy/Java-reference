package ifStatements;

public class JavaIfStatement {

    public static void main(String[] args) {
//        boolean isAlien = false;
//        if(!isAlien) {
//            System.out.println("It is not an alien!");
//        }else{
//            System.out.println("It's an alien!");
//        }
//
//        int topScore = 81;
//        int secondTopScore = 80;
//        if((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than top score and less than 100!");
//        }
//
//        //ternary operator
//        boolean isCar = true;
//        if (!isCar) {
//            System.out.println("This is not supposed to happen");
//        }
//        boolean wasCar = isCar ? true : false;
//        if (wasCar == true) {
//            System.out.println("Was car is true");
//        }
        //operator challenge
        double var1 = 20.00d;
        double var2 = 80.00d;
        double var3 = (var1 + var2) * 100.00d;
        double var4 = var3 % 40.00d;
        System.out.println("The total is: " + var3);
        System.out.println("The remainder is: " + var4);
        boolean isZero = (var4 == 0) ? true : false;
        System.out.println("The boolean variable is: " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}

