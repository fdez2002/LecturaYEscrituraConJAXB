/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritutajaxbDeposito;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Antonio
 */
@XmlRootElement(name="depositos")
//@XmlType(propOrder={"deposito"})
public class ListaDeposito {
    private ArrayList<Deposito> depositos;

    public ListaDeposito() {
    }

    public ListaDeposito(ArrayList<Deposito> depositos) {
        this.depositos = depositos;
    }

    //@XmlElementWrapper(name="depositos")
    @XmlElement(name="deposito")//Elemento que tendra depositos
    public ArrayList<Deposito> getDepositos() {
        return depositos;
    }

    public void setDepositos(ArrayList<Deposito> depositos) {
        this.depositos = depositos;
    }
    
    
    
}
