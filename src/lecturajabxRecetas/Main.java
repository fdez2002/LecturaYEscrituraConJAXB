/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajabxRecetas;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lecturajaxbPizzas.Pizza;
import lecturajaxbPizzas.Pizzas;

/**
 *
 * @author Antonio
 */
public class Main {
     public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Recetas.class);
        
        Unmarshaller unmarshaller = context.createUnmarshaller();//Nos permite leer el XML
        Recetas recetas =  (Recetas) unmarshaller.unmarshal(new File("recetas.xml"));//Recibe el xml
        
        ArrayList<Receta> recetas2 = recetas.getRecetas();

        //Mostramos el xml
        for(Receta r: recetas2){
            System.out.println(r.getTipo() + "" + r.getDificultad() + "" + r.getNombre()+ "" + r.getIngredientes() + "" + r.getCalorias()+
                    "" + r.getPasos() + "" + r.getTiempo() +  "" + r.getElaboracion());
        }
    }
}
