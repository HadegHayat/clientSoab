
package stub;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "EtudiantWService", targetNamespace = "http://serveur/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EtudiantWService {


    /**
     * 
     * @return
     *     returns java.util.List<stub.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listStudents", targetNamespace = "http://serveur/", className = "stub.ListStudents")
    @ResponseWrapper(localName = "listStudentsResponse", targetNamespace = "http://serveur/", className = "stub.ListStudentsResponse")
    @Action(input = "http://serveur/EtudiantWService/listStudentsRequest", output = "http://serveur/EtudiantWService/listStudentsResponse")
    public List<Student> listStudents();

}
