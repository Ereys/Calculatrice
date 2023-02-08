import models.Calculator;
import utils.StringParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        Calculator calculette = new Calculator();
        BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));
        double a, b;
        String op;
        String chose;

        do{
            try {
                System.out.print("a = ");
                a = Double.parseDouble(scanf.readLine());

                System.out.print("Chose between [+,-,*,/] :");
                op = scanf.readLine();
                StringParser.checkOperator(op);

                System.out.print("b = ");
                b = Double.parseDouble(scanf.readLine());

                calculette.addCalculToHistoryList(a, b, op);
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            try {
                System.out.print("Chose between 1(Calcul), 2(Display History), 3(Quit) : ");
                chose = scanf.readLine();
                StringParser.checkInputUser(chose);
            }catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }

            if(chose.equals("1")) {
                continue;
            }
            if(chose.equals("2")){
                calculette.displayCalculHistory();
            }
            if(chose.equals("3")){
                break;
            }
        }while(true);
    }
}