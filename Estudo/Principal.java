package model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException{
        Disciplina grafos = new Disciplina("Grafos", 2016, 4); 
        Matricula matricula1 = new Matricula("Pedro", grafos);

        XStream xstream = new XStream(new DomDriver("UTF-8"));
        
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("matricula", Matricula.class);
        
        String xml = xstream.toXML(matricula1);
        System.out.println(xml);
        
        matricula1 = null;
        matricula1 = (Matricula) xstream.fromXML(xml);
       
        
      
    }
}
