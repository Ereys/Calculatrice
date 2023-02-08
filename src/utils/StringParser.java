package utils;

/**
 * Class to check if the inputs are correct
 */
public class StringParser {

    public static boolean checkInputUser(String input){
        String inputUserRegex = "^[1-3]";

        if(input.matches(inputUserRegex)){
            return true;
        }else{
            throw new IllegalArgumentException("Error: Illegal caracter, chose between 1,2 or 3");
        }
    }

    public static boolean checkOperator(String operator){
        String operatorRegex = "^[+,-,*,/]";
        if(operator.matches(operatorRegex)){
            return true;
        }else{
            throw new IllegalArgumentException("Incorrect value: chose between +,-,* or /");
        }
    }
}
