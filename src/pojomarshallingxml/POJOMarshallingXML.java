/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojomarshallingxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import pojomarshallingxml.pojo.Direccion;

/**
 *
 * @author matinal
 */
public class POJOMarshallingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el pojo
        Direccion direccion=new Direccion("calle", "luna", "1", "1", "A", 
                "Izq", "B", "Jaén", 23008, "Jaén", "España");
        try {
            /*Cargamos la configuracion para que el "Marshaller" sepa como
            convertir el pojo a xml, para eso necesito la clase previamente
            estaba con anotacione jaxb*/
            JAXBContext jbc = JAXBContext.newInstance(direccion.getClass());
            /*creamos el marshaller que es el encargado de volcar el objeto a fichero xml, pero este solo
            sirve para la clase Direccion porque arriba hemos cargado el contexto direccion
            */
            Marshaller jbcm = jbc.createMarshaller();
            //Activar human-friendly
            jbcm.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jbcm.marshal(direccion, new File("direccion.xml"));
        } catch (JAXBException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
