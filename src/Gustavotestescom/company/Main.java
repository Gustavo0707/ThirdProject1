package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1;
	boolean valorInválido = false;

	Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Put you note");
            number1 = scanner.nextInt();
            if(number1 >= 0 && number1 <= 10){
                valorInválido = true;
            }
            else{
                System.out.println("nota inválida, digite novamente");
            }

        }while (!valorInválido);
    }
}