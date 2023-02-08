import models.Calculatrice;
import utils.StringParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static utils.StringParser.checkInputUser;

public class Main {
    public static void main(String[] args) throws Exception{

        Calculatrice calculette = new Calculatrice();

        BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));
        double a, b;
        String op;
        String chose;

        String inputUserRegex = "^[1-3]";
        String operatorRegex = "^[+,-,*,/]";



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

            System.out.print("Chose between 1(Calcul), 2(Display History), 3(Quit) : ");
            try {
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