
package com.henriqueandrewsilva.provider;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

// @author Henrique Andrew da Silva

@WebService(serviceName = "WsServicoSoma")
@Stateless()
public class WsServicoSoma {
    
    /*@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
    
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "valor1") int v1, @WebParam(name = "valor2") int v2) {
        return v1 + v2;
    }
}
