/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajabxRecetas;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
//@XmlRootElement(name="tipo")
@XmlType(propOrder={"definicion"})

public class Tipo {
    
    private String definicion;

    public Tipo() {
    }

    public Tipo(String definicion) {
        this.definicion = definicion;
    }

    @XmlAttribute(name = "definicion")//Atributo de tipo
    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
    
    
    
}
