//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 10:58:10 AM EST 
//


package br.org.abrasf.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcMensagemRetorno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcMensagemRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.abrasf.org.br/nfse.xsd}tsCodigoMensagemAlerta"/>
 *         &lt;element name="Mensagem" type="{http://www.abrasf.org.br/nfse.xsd}tsDescricaoMensagemAlerta"/>
 *         &lt;element name="Correcao" type="{http://www.abrasf.org.br/nfse.xsd}tsDescricaoMensagemAlerta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcMensagemRetorno", propOrder = {
    "codigo",
    "mensagem",
    "correcao"
})
public class TcMensagemRetorno {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Mensagem", required = true)
    protected String mensagem;
    @XmlElement(name = "Correcao")
    protected String correcao;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Sets the value of the mensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Gets the value of the correcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrecao() {
        return correcao;
    }

    /**
     * Sets the value of the correcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrecao(String value) {
        this.correcao = value;
    }

}
