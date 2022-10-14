/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturajaxbPizzas;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Antonio
 */
public class LecturaJAXB {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Pizzas.class);
        
        Unmarshaller unmarshaller = context.createUnmarshaller();//Nos permite leer el XML
        Pizzas pizzeria = (Pizzas) unmarshaller.unmarshal(new File("pizzas.xml"));//Recibe el xml
        
        ArrayList<Pizza> pizzas = pizzeria.getPizza();

        for(Pizza p: pizzas){
            System.out.println(p.getNombre() + "" + p.getPrecio() + ""+ p.getIngrediente() );
        }
    }
    
}
