/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajabxRecetas;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
//@XmlRootElement(name = "ingredientes")
@XmlType(propOrder = {"ingrediente", "nombre", "cantidad"})//Pizza tendra dentro estas propiedades, en ese orden

public class Ingredientes {

    private String ingrediente;
    private int cantidad;
    private String nombre;

    public Ingredientes() {
    }

    public Ingredientes(String ingrediente, int cantidad, String nombre) {
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    @XmlElement(name = "ingrediente")//Elemento que tendra ingredientes
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @XmlAttribute(name = "cantidad")//Elemento que tendra ingredientes
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @XmlAttribute(name = "nombre")//Elemento que tendra ingredientes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
