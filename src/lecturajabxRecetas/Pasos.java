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
@XmlRootElement(name = "pasos")//Root del xml
@XmlType(propOrder={"paso", "orden"})//Pizza tendra dentro estas propiedades, en ese orden

public class Pasos {

    private String paso;
    private int orden;

    public Pasos() {
    }

    public Pasos(String paso, int orden) {
        this.paso = paso;
        this.orden = orden;
    }

    @XmlElement(name = "paso")//Elemento que tendra pasos
    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }

    @XmlAttribute(name= "orden")//Elemento que tendra pasos
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

}
