package pe.edu.pe.p;

import pe.edu.pe.p.utils.Menu;
import pe.edu.pe.p.utils.leerteclado;

public class App 
{
 public static void main(String[] args) {
        leerteclado teclado = new leerteclado();
        Menu menu = new Menu();

        menu.MenuOpt(teclado);


    }
  
}
