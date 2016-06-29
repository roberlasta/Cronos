/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronosfmt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author roberto.salinas
 */
public class Fichada {
    LocalDate dia;
    LocalDateTime entra1;
    LocalDateTime entra2;
    LocalDateTime entra3;
    LocalDateTime entra4;
    LocalDateTime entra5;
    LocalDateTime sale1;
    LocalDateTime sale2;
    LocalDateTime sale3;
    LocalDateTime sale4;
    LocalDateTime sale5;
    LocalTime normal;
    LocalTime excedidas;
    String observaciones;

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDateTime getEntra1() {
        return entra1;
    }

    public void setEntra1(LocalDateTime entra1) {
        this.entra1 = entra1;
    }

    public LocalDateTime getEntra2() {
        return entra2;
    }

    public void setEntra2(LocalDateTime entra2) {
        this.entra2 = entra2;
    }

    public LocalDateTime getEntra3() {
        return entra3;
    }

    public void setEntra3(LocalDateTime entra3) {
        this.entra3 = entra3;
    }

    public LocalDateTime getEntra4() {
        return entra4;
    }

    public void setEntra4(LocalDateTime entra4) {
        this.entra4 = entra4;
    }

    public LocalDateTime getEntra5() {
        return entra5;
    }

    public void setEntra5(LocalDateTime entra5) {
        this.entra5 = entra5;
    }

    public LocalDateTime getSale1() {
        return sale1;
    }

    public void setSale1(LocalDateTime sale1) {
        this.sale1 = sale1;
    }

    public LocalDateTime getSale2() {
        return sale2;
    }

    public void setSale2(LocalDateTime sale2) {
        this.sale2 = sale2;
    }

    public LocalDateTime getSale3() {
        return sale3;
    }

    public void setSale3(LocalDateTime sale3) {
        this.sale3 = sale3;
    }

    public LocalDateTime getSale4() {
        return sale4;
    }

    public void setSale4(LocalDateTime sale4) {
        this.sale4 = sale4;
    }

    public LocalDateTime getSale5() {
        return sale5;
    }

    public void setSale5(LocalDateTime sale5) {
        this.sale5 = sale5;
    }

    public LocalTime getNormal() {
        return normal;
    }

    public void setNormal(LocalTime normal) {
        this.normal = normal;
    }

    public LocalTime getExcedidas() {
        return excedidas;
    }

    public void setExcedidas(LocalTime excedidas) {
        this.excedidas = excedidas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
