//import com.google.gson.GsonBuilder;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//import java.io.*;
//
//import com.google.gson.Gson;



//public class Main {
//    public final static String XML_FILE ="./acciones.xml";
//    public static void main(String[] args) throws FileNotFoundException, JAXBException {
//        Acciones acciones = convertirXmlAObjeto(new FileInputStream(XML_FILE));
//        System.out.println(convertirObjetoAJson(acciones));




//    public static Acciones convertirXmlAObjeto(InputStream in) throws JAXBException{
//        JAXBContext jaxbContext = JAXBContext.newInstance(Acciones.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//        return (Acciones) unmarshaller.unmarshal(in);
//
//    }
//
//    public static String convertirObjetoAJson(Acciones accion){
//        GsonBuilder gsonBuilder= new GsonBuilder();
//        gsonBuilder.setPrettyPrinting();
//        gsonBuilder.disableHtmlEscaping();
//
//        Gson gson = gsonBuilder.create();
//        return gson.toJson(accion, Acciones.class);
//    }

// }

public class Main {
    public static void main(String[] args) throws FileNotFoundException, JAXBException {

    }
}