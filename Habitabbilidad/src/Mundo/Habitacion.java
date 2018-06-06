/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author TOSHIBA
 */
public class Habitacion {
        private String paredes;
        private String techo;
        private String suelo;
        private String ventilacion;
        private int costoParedes;
        private int costoTecho;
        private int costoSuelo;
        private int costoVentilacion;
        private int costoTotal;
        private String temperatura;
        private String olor;

    public Habitacion(String paredes, String techo, String suelo, String ventilacion, int costoParedes, int costoTecho, int costoSuelo, int costoVentilacion, int costoTotal, String temperatura, String olor) {
        this.paredes = paredes;
        this.techo = techo;
        this.suelo = suelo;
        this.ventilacion = ventilacion;
        this.costoParedes = costoParedes;
        this.costoTecho = costoTecho;
        this.costoSuelo = costoSuelo;
        this.costoVentilacion = costoVentilacion;
        this.costoTotal = costoTotal;
        this.temperatura = temperatura;
        this.olor = olor;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }

    

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
    

    public int getCostoParedes() {
        return costoParedes;
    }

    public void setCostoParedes(int costoParedes) {
        this.costoParedes = costoParedes;
    }

    public int getCostoTecho() {
        return costoTecho;
    }

    public void setCostoTecho(int costoTecho) {
        this.costoTecho = costoTecho;
    }

    public int getCostoSuelo() {
        return costoSuelo;
    }

    public void setCostoSuelo(int costoSuelo) {
        this.costoSuelo = costoSuelo;
    }

    public int getCostoVentilacion() {
        return costoVentilacion;
    }

    public void setCostoVentilacion(int costoVentilacion) {
        this.costoVentilacion = costoVentilacion;
    }
        

    
    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public String getTecho() {
        return techo;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public String getSuelo() {
        return suelo;
    }

    public void setSuelo(String suelo) {
        this.suelo = suelo;
    }

    public String getVentilacion() {
        return ventilacion;
    }

    public void setVentilacion(String ventilacion) {
        this.ventilacion = ventilacion;
    }
        
        
        
}
