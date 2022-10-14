/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajaxbPizzas;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
@XmlRootElement(name="pizza")//Elemento root
@XmlType(propOrder={ "nombre", "precio", "ingrediente"})//Pizza tendra dentro estas propiedades, en ese orden
public class Pizza {

    private String nombre;
    private int precio;
    private ArrayList<String> ingrediente;

    public Pizza() {
    }

    public Pizza(String nombre, int precio, ArrayList<String> ingrediente) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingrediente = ingrediente;
    }



    @XmlElement(name = "nombre")//Elemento que tendra pizza
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElement(name = "precio")//Elemento que tendra pizza
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @XmlElement(name = "ingrediente")//Elemento que tendra pizza
    public ArrayList<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<String> ingrediente) {
        this.ingrediente = ingrediente;
    }
    

    

}
