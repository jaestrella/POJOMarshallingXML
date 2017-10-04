/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojomarshallingxml.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Direccion {
    private String tipoVia;
    private String nombreVia;
    private String numero;
    private String planta;
    private String puerta;
    private String escalera;
    private String portal;
    private String localidad;
    private int cp;
    private String provincia;
    private String pais;

    public Direccion(String tipoVia, String nombreVia, String numero, String planta, String puerta, String escalera, String portal, String localidad, int cp, String provincia, String pais) {
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.escalera = escalera;
        this.portal = portal;
        this.localidad = localidad;
        this.cp = cp;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Direccion() {
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
