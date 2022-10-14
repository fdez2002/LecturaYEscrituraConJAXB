/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturajabxRecetas;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
//@XmlRootElement(name = "receta")
@XmlType(propOrder = {"tipo", "dificultad", "nombre", "ingredientes", "calorias", "pasos", "tiempo", "elaboracion"})//Pizza tendra dentro estas propiedades, en ese orden
public class Receta {

    private Tipo tipo;
    private String dificultad;
    private String nombre;
    private ArrayList<Ingredientes> ingredientes;
    private int calorias;
    private ArrayList<Pasos> pasos;
    private String tiempo;
    private String elaboracion;

    public Receta() {
    }

    public Receta(Tipo tipo, String dificultad, String nombre, ArrayList<Ingredientes> ingredientes, int calorias, ArrayList<Pasos> pasos, String tiempo, String elaboracion) {
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
        this.pasos = pasos;
        this.tiempo = tiempo;
        this.elaboracion = elaboracion;
    }

    @XmlElement(name = "dificultad")//Elemento que tendra receta
    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @XmlElement(name = "tipo")//Elemento que tendra receta
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @XmlElement(name = "nombre")//Elemento que tendra receta
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement(name = "ingredientes")//Elemento que tendra receta
    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @XmlElement(name = "calorias")//Elemento que tendra receta
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @XmlElement(name = "pasos")//Elemento que tendra receta
    public ArrayList<Pasos> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<Pasos> pasos) {
        this.pasos = pasos;
    }

    @XmlElement(name = "tiempo")//Elemento que tendra receta
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @XmlElement(name = "elaboracion")//Elemento que tendra receta
    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

}
