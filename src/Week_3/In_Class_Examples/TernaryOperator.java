package Week_3.In_Class_Examples;

public class TernaryOperator {
    public static void main(String[] args) {

        Boolean isSunny, isWarm;
        isSunny = true;
        isWarm = false;

        //Logic Operators
        // && --> And
        // || --> Or

        //Using the && Operator (And)
        if(isSunny && isWarm) { //Both statements have to be true using &&
            System.out.println("Let's get ice cream.");
        }

        //Using the || Operator (Or)
        if(isSunny || isWarm) { //Either one is true or both or true. At least one condition is met
            System.out.println("Let's get ice cream.");
        }

        //Condition ? expression1 : expression2
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";  // % sign makes it so whatever number
        // is divisible by 2 (The number to the right will be a whole number with no decimal
        System.out.println("The number is: " + result);





    }
}
