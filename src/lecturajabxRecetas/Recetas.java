/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajabxRecetas;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
@XmlRootElement(name = "recetas")//Root del xml
//@XmlType(propOrder = {"recetas"})//Pizza tendra dentro estas propiedades, en ese orden

public class Recetas {

    private ArrayList<Receta> recetas;

    public Recetas() {
    }

    public Recetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    @XmlElement(name = "receta")//Cada elemto de la collecion es un elemnto pizza
    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas= recetas;
    }

}
