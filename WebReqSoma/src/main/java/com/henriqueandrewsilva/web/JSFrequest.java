package com.henriqueandrewsilva.web;

import com.henriqueandrewsilva.cli.WsServicoSoma;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;

// @author Henrique Andrew da Silva

@Named(value = "jSFrequest")
@Dependent
public class JSFrequest {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WsServicoSoma/WsServicoSoma.wsdl")
    private com.henriqueandrewsilva.cli.WsServicoSoma_Service service;

    public JSFrequest() {
    }
    
    private int valor1, valor2, resultado;
    
    public void somar(){
        
        try {
            WsServicoSoma port = service.getWsServicoSomaPort();
            int result = port.somar(valor1, valor2);
            System.out.println("Result = "+result);
            resultado= result;
        } catch (Exception ex) {
            resultado= 0;
        }
        
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
