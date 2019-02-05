
package br.org.abrasf.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarNfseServicoPrestadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarNfseServicoPrestadoResult"
})
@XmlRootElement(name = "ConsultarNfseServicoPrestadoResponse")
public class ConsultarNfseServicoPrestadoResponse {

    @XmlElement(name = "ConsultarNfseServicoPrestadoResult")
    protected String consultarNfseServicoPrestadoResult;

    /**
     * Obtém o valor da propriedade consultarNfseServicoPrestadoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarNfseServicoPrestadoResult() {
        return consultarNfseServicoPrestadoResult;
    }

    /**
     * Define o valor da propriedade consultarNfseServicoPrestadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarNfseServicoPrestadoResult(String value) {
        this.consultarNfseServicoPrestadoResult = value;
    }

}
