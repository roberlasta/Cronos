/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronosfmt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author roberto.salinas
 */
public class Persona {

    String nombre;
    String legajo;
    String tarjeta;
    LocalTime horaIngreso;
    LocalTime horaSalida;
    LocalTime horasNormales;
    LocalTime horasExcedentes;
    
    final ArrayList<Fichada> listaFichadas;

    public Persona(String nombre, String legajo, String tarjeta, LocalTime horaIngreso, LocalTime horaSalida, LocalTime horasNormales, LocalTime horasExcedentes) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.tarjeta = tarjeta;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.horasNormales = horasNormales;
        this.horasExcedentes = horasExcedentes;
        listaFichadas = new ArrayList();
    }
    
    // agregar una fichada
    public void addFichada(Fichada fichada)
    {
        this.listaFichadas.add(fichada);
    }    
    // limpiar las fichadas
    public void limpiarFichadas(){
        this.listaFichadas.clear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHorasExcedentes() {
        return horasExcedentes;
    }

    public void setHorasExcedentes(LocalTime horasExcedentes) {
        this.horasExcedentes = horasExcedentes;
    }

    public LocalTime getHorasNormales() {
        return horasNormales;
    }

    public void setHorasNormales(LocalTime horasNormales) {
        this.horasNormales = horasNormales;
    }
    
  
}
