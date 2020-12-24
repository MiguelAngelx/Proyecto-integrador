package pe.edu.pe.p.utils;

import pe.edu.pe.p.Proyecto.ProyectoIntegrador;

public class Menu {
    public static void MenuOpt(leerteclado teclado) {
        int numberOption;
        ProyectoIntegrador examen = new ProyectoIntegrador();

        System.out.println(
                "Selecciones la opcion que mas desee :\n[1] realizar compra\n[0]finalizar\n");
        System.out.print("\n==> ");
        numberOption = teclado.lector(3);

        switch (numberOption) {
            case 1:
                examen.ejercicio1();
                repeatCicle(teclado);
                break;

            case 0:
                System.out.println("!Hasta la proxima¡");
                break;
            default:
                System.out.println("lo siento no existe ese valor....");
                repeatCicle(teclado);

        }
    }

    public static void repeatCicle(leerteclado teclado) {
        int numberOption;
        System.out.print("\n\n¿Deseas volver al Menú?: \n[1] SI \n[2] NO \n\n==> ");
        numberOption = teclado.lector(3);

        if (numberOption == 1) {
            MenuOpt(null);
        } else if (numberOption == 2) {
            System.out.println("\nHasta la proxima");
        } else {
            System.out.println("\nlo sentimos no existen esas Opciones....");
            repeatCicle(null);
        }
    }    
}