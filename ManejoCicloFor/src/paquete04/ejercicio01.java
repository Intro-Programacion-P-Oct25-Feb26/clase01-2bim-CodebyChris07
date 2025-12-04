/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

30-60-90-120

29-58-87-116

28-56-84-112

27-54-81-108

26-52-78-104

25-50-75-100

24-48-72-96

23-46-69-92

22-44-66-88

21-42-63-84

20-40-60-80

19-38-57-76

18-36-54-72

17-34-51-68

16-32-48-64

15-30-45-60

14-28-42-56

13-26-39-52

12-24-36-48

11-22-33-44

10-20-30-40

Totales = 420-840-1260-1680
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int operacion1;
        int operacion2;
        int operacion3;
        int resta = 0;
        int resta1 = 0;
        int resta2 = 0;
        int resta3 = 0;
        String mensajeFinal = "";
        for (int i = 30; i >= 10; i--) { // for 30
            operacion1 = i * 2;
            operacion2 = i * 3;
            operacion3 = i * 4;
            mensajeFinal = String.format("%s%d - %d - %d - %d\n",
                    mensajeFinal, i, operacion1, operacion2, operacion3);
            resta+= i;
            resta1+= operacion1;
            resta2+= operacion2;
            resta3+= operacion3;
        }
        String mensajeResta = "";
        mensajeResta = String.format("%s%d - %d - %d - %d\n",
                    mensajeResta, resta, resta1, resta2, resta3);
        System.out.printf("%s\nTotales = %s\n", mensajeFinal, mensajeResta);
        
        

        
    }
}
