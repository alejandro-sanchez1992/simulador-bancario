/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class CuentaEn {
    private int tipo;
    private int titular;
    private double saldo;
    private LocalDateTime fecha;

    public CuentaEn(int tipo, int titular, double saldo, LocalDateTime fecha) {
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTitular() {
        return titular;
    }

    public void setTitular(int titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
}
