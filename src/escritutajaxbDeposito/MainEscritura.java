/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritutajaxbDeposito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Antonio
 */
public class MainEscritura {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(ListaDeposito.class);

        //Escribimos el xml
        Marshaller marshaller = context.createMarshaller();

        //Metemos contenido en el fichero
        ListaDeposito deposito = new ListaDeposito();

        ArrayList<Deposito> depositos = new ArrayList();
        Deposito deposito1 = new Deposito();
//        deposito1.setValoresDeposito("Deposito1", 2, 4);
//        depositos.add(deposito1);

        //Metemos por teclado valores
        System.out.println("Id del deposito");
        String id = sc.nextLine();

        System.out.println("Diametro del deposito");
        float diametro = sc.nextFloat();

        System.out.println("Alura del deposito");
        float deposito22 = sc.nextFloat();
        deposito1.setValoresDeposito(id, diametro, deposito22);

        depositos.add(deposito1);
        deposito.setDepositos(depositos);

        //Volcamos la informacion en un xml
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//Le damos formato
        //marshaller.marshal(deposito, System.out);
        marshaller.marshal(deposito, new FileWriter("depositos.xml"));//Escribimos el contenido en el fichero
    }

}
