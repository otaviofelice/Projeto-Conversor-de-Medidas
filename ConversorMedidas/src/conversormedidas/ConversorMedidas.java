/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormedidas;

import java.text.DecimalFormat;
import java.util.Scanner;



public class ConversorMedidas {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        while (true) {
            System.out.println("Escolha uma conversão:");
            System.out.println("1. Centímetros para Polegadas");
            System.out.println("2. Polegadas para Centímetros");
            System.out.println("3. Graus Celsius para Graus Fahrenheit");
            System.out.println("4. Graus Fahrenheit para Graus Celsius");
            System.out.println("5. Sair");

            int escolha = entradaInteiraValida(tcl, "Escolha uma opção (1-5): ");
                        if (escolha == 5) {
                System.out.println("Fim do programa");
                break;
            } 
            double valor;
            switch (escolha) {
                case 1:
                    valor = entradaDoubleValida(tcl, "Digite o valor em centímetros: ");
                    System.out.printf(valor + " centímetros equivalem a " + df.format(centimetrosParaPolegadas(valor)) + " polegadas.");
                    break;
                case 2:
                    valor = entradaDoubleValida(tcl, "Digite o valor em polegadas: ");
                    System.out.println(valor + " polegadas equivalem a " + df.format(polegadasParaCentimetros(valor)) + " centímetros.");
                    break;
                case 3:
                    valor = entradaDoubleValida(tcl, "Digite a temperatura em graus Celsius: ");
                    System.out.println(valor + " graus Celsius equivalem a " + df.format(celsiusParaFahrenheit(valor)) + " graus Fahrenheit.");
                    break;
                case 4:
                    valor = entradaDoubleValida(tcl, "Digite a temperatura em graus Fahrenheit: ");
                    System.out.println(valor + " graus Fahrenheit equivalem a " + df.format(fahrenheitParaCelsius(valor)) + " graus Celsius.");
                    break;
                default:
                    System.out.println("Opção inválida, escolha uma opção válida (1-5).");
                    break;
            }        }
    }
    
    public static double centimetrosParaPolegadas(double centimetros) {
        return centimetros / 2.54;
    }
    public static double polegadasParaCentimetros(double polegadas) {
        return polegadas * 2.54;
    }
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static int entradaInteiraValida(Scanner tcl, String prompt) {
        int valor;
        while (true) {
            try {
                System.out.print(prompt);
                valor = Integer.parseInt(tcl.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, digite um número inteiro válido.");
            }
        }
        return valor;
    }

    public static double entradaDoubleValida(Scanner tcl, String prompt) {
        double valor;
        while (true) {
            try {
                System.out.print(prompt);
                valor = Double.parseDouble(tcl.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, digite um número válido.");
            }
        }
        return valor;
    }
}  