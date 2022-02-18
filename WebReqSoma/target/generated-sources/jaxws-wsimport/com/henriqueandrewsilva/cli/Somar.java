
package com.henriqueandrewsilva.cli;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somar", propOrder = {
    "valor1",
    "valor2"
})
public class Somar {

    protected int valor1;
    protected int valor2;

    /**
     * Obtém o valor da propriedade valor1.
     * 
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * Define o valor da propriedade valor1.
     * 
     */
    public void setValor1(int value) {
        this.valor1 = value;
    }

    /**
     * Obtém o valor da propriedade valor2.
     * 
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * Define o valor da propriedade valor2.
     * 
     */
    public void setValor2(int value) {
        this.valor2 = value;
    }

}
