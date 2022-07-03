
package co.com.slogistic.appp.mvc;

import controlador.Controladorr;
import modelo.Modeloo;
import vista.Vistaa;


public class Mvc {

    public static void main(String[] args) {
        
        Modeloo mod = new Modeloo();
        Vistaa view = new Vistaa();
        
        Controladorr ctrl = new Controladorr(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
}
