
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
 *         &lt;element name="RecepcionarLoteRpsSincronoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "recepcionarLoteRpsSincronoResult"
})
@XmlRootElement(name = "RecepcionarLoteRpsSincronoResponse")
public class RecepcionarLoteRpsSincronoResponse {

    @XmlElement(name = "RecepcionarLoteRpsSincronoResult")
    protected String recepcionarLoteRpsSincronoResult;

    /**
     * Obtém o valor da propriedade recepcionarLoteRpsSincronoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecepcionarLoteRpsSincronoResult() {
        return recepcionarLoteRpsSincronoResult;
    }

    /**
     * Define o valor da propriedade recepcionarLoteRpsSincronoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecepcionarLoteRpsSincronoResult(String value) {
        this.recepcionarLoteRpsSincronoResult = value;
    }

}
