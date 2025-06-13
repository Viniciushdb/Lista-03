package ProfessorGlender.Lista03;
import java.util.Scanner;

public class Atv4_DiasCorridos {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in); 
        int dia1, dia2, mes1, mes2, ano1, ano2;

        System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
        System.out.println("> Dia: ");
        dia1 = sc.nextInt();
        System.out.println("> Mês: ");
        mes1 = sc.nextInt();
        System.out.println("> Ano: ");
        ano1 = sc.nextInt();

        System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
        System.out.println("> Dia: ");
        dia2 = sc.nextInt();
        System.out.println("> Mês: ");
        mes2 = sc.nextInt();
        System.out.println("> Ano: ");
        ano2 = sc.nextInt();

       
        
        if (ano1 > ano2 || dia1 > 30 || mes1 > 12 || dia2 > 30 || mes2 > 12) {
            boolean erro = true;
            while (erro == true) {    
                System.out.println("\n=== Dado incorretos - Tente Novamente ==");

                System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia1 = sc.nextInt();
                System.out.println("> Mês: ");
                mes1 = sc.nextInt();
                System.out.println("> Ano: ");
                ano1 = sc.nextInt();

                System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia2 = sc.nextInt();
                System.out.println("> Mês: ");
                mes2 = sc.nextInt();
                System.out.println("> Ano: ");
                ano2 = sc.nextInt();

                if (ano1 < ano2 || dia1 < 30 || mes1 < 12 || dia2 < 30 || mes2 < 12){
                    erro = false;
                }
            }
        } else if (mes1 == 2 && dia1 > 28 || mes2 == 2 && dia2 > 28) {
            boolean erro = true;
            while (erro == true) {  
                System.out.println("\n=== Dado incorretos - Tente Novamente ==");

                System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia1 = sc.nextInt();
                System.out.println("> Mês: ");
                mes1 = sc.nextInt();
                System.out.println("> Ano: ");
                ano1 = sc.nextInt();

                System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia2 = sc.nextInt();
                System.out.println("> Mês: ");
                mes2 = sc.nextInt();
                System.out.println("> Ano: ");
                ano2 = sc.nextInt();
                
                if (mes1 == 2 && dia1 < 29 || mes2 == 2 && dia2 < 29){
                    erro = false;
                }
            } 
        } else if (ano1 == ano2 && dia1 == dia2 && mes1 == mes2) {
            System.out.println("\n== As datas digitadas são iguais! 0 dias se passaram. ==\n");
        }

        System.out.println("\n=== DATA 01: " + dia1 + "/" + mes1 + "/" + ano1 + " ===");
        System.out.println("=== DATA 02: " + dia2 + "/" + mes2 + "/" + ano2 + " ===\n");

       
        int diasRestantes1 = 0, diasRestantes2 = 0, extraBissexto = 0;

        if (ano1 %4 == 0 && ano1 %100 != 0 || ano1 %400 == 0) {
            extraBissexto = 1;
        }

        if (mes1 == 1) {
            diasRestantes1 = (30 - dia1 + 1) + (28 + extraBissexto) + 300;
        } else if (mes1 == 2) {
            diasRestantes1 = (28 + extraBissexto + 1) + 300;
        } else if (mes1 > 2) {
            diasRestantes1 = (30 - dia1 + 1) + (12 - mes1) * 30;
        }
        
      

        if (ano2 %4 == 0 && ano2 %100 != 0 || ano2 %400 == 0) {
            extraBissexto = 1;
        }

        if (mes2 <= 2) {
            diasRestantes2 = 30 * (mes2 - 1) + dia2;
        } else if (mes1 >= 2) {
            diasRestantes2 = 30 * (mes2 - 2) + dia2 + (28 + extraBissexto);
        } 

        int diasAno1e2 = diasRestantes1 + diasRestantes2;
        int anosTotais = ano2 - ano1;
        int diasEntre = (anosTotais * ((11 * 30) + 28)) - diasAno1e2;

       
        while (ano1 != ano2) {

            if (ano1 %4 == 0 && ano1 %100 != 0 || ano1 %400 == 0) {
              
                diasEntre++;  
                ano1++;
            } else {
                
                ano1++;
            }

        }

       

        int diasFinal = diasEntre + diasAno1e2;  

        System.out.println("=== O total de dias entre as datas é de " + diasFinal + " dias. ===\n");

        sc.close();

    }
}
