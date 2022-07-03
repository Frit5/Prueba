
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modeloo;
import vista.Vistaa;


public class Controladorr implements ActionListener{
    
    private Vistaa view;
    private Modeloo model;
    
    public Controladorr(Vistaa view, Modeloo model){
        this.view=view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
        
    }
    
    public void iniciar(){
    view.setTitle("MVC Multiplicar");
    view.setLocationRelativeTo(null);
       
}
    
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.Multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
       
    }
    
    
}
