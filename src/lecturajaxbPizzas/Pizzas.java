/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajaxbPizzas;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
@XmlRootElement(name="pizzas")//Root del xml
@XmlType(propOrder={"pizza"})//Orden del xml

public class Pizzas {
    
    private ArrayList<Pizza> pizzas;

    public Pizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Pizzas() {
    }
    

    //@XmlElementWrapper(name="pizzas")//Elemtno envoltorio ademas de root
    @XmlElement(name="pizza")//Cada elemto de la collecion es un elemnto pizza
    public ArrayList<Pizza> getPizza() {
        return pizzas;
    }

    public void setPizza(ArrayList<Pizza> pizza) {
        this.pizzas = pizza;
    }
    
    
}
