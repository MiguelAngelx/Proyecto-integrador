package pe.edu.pe.p.Proyecto;

import pe.edu.pe.p.utils.leerteclado;
import java.util.Scanner;

public class ProyectoIntegrador {

        public static leerteclado teclado = new leerteclado();

    public void ejercicio1() {
        int CantAutomoviles, costo = 0, categoria, categoria1 = 0, categoria2 = 0, categoria3 = 0,total=0;
        double impuesto = 0, impuestoAPagar = 0;
       System.out.println(
                "Menu :\n[1]LecheGloriaGrande: 3.50 s/.\n[2]LecheGloriaPequeña: 1.50 s/.\n[3]MantequillaGloria: 2.00 s/.");
  
        System.out.println("cunatos fue su eleccion: ");
        CantAutomoviles = teclado.lector(0);

        for (int i = 1; i <= CantAutomoviles; i++) {
            System.out.println("opcion: " + i);
            System.out.println("Ingrese el numero del menu: ");
            categoria = teclado.lector(0);
            System.out.println("Ingrese el valor dado: ");
            costo = teclado.lector(0);
            if (categoria == 1) {
                impuesto = costo + 0;
                categoria1 = (int) (categoria1 + impuesto);
            }
            if (categoria == 2) {
                impuesto = costo + 0;
                categoria2 = (int) (categoria2 + impuesto);
            }
            if (categoria == 3) {
                impuesto = costo + 0;
                categoria3 = (int) (categoria3 + impuesto);
            }
            if (total==0){
                total=categoria1+categoria2+categoria3;
            }
         System.out.println(
                "-Factura-");
        String nom= null;
        Scanner nombre=new Scanner(System.in);
        System.out.println("ApellidosyNombres");
        nom=nombre.nextLine();

        }
              
       
        System.out.println("LecheGloriaGrande : " + categoria1);
        System.out.println("LecheGloriaPequeña : " + categoria2);
        System.out.println("MantequillaGloria : " + categoria3);
       
    }    
}