import models.Calculatrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
                if(!op.matches(operatorRegex)){
                    throw new IllegalArgumentException();
                }

                System.out.print("b = ");
                b = Double.parseDouble(scanf.readLine());

                calculette.addCalculToHistoryList(a, b, op);
            }catch(Exception e){
                System.out.println("Error : Illegal caracters");
                continue;
            }

            System.out.print("Chose between 1(Calcul), 2(Display History), 3(Quit) : ");
            chose = scanf.readLine();

            if(!chose.matches(inputUserRegex)){
                System.out.println("Error: Illegal caracter, chose between 1,2 or 3");
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