package Entidades;

import java.time.LocalDate;

public class Reserva {
   private int idReserva;
   private Huesped huesped;
   private int cantPersonas;
   private Habitacion habitacion;
   private LocalDate fechaEntrada;
   private LocalDate fechaSalida;
   private double importeTotal;

    public Reserva(int idReserva, Huesped huesped, int cantPersonas, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.cantPersonas = cantPersonas;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importeTotal = importeTotal;
    }

    public Reserva(Huesped huesped, int cantPersonas, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal) {
        this.huesped = huesped;
        this.cantPersonas = cantPersonas;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importeTotal = importeTotal;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", huesped=" + huesped + ", cantPersonas=" + cantPersonas + ", habitacion=" + habitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", importeTotal=" + importeTotal + '}';
    }
   
   
   
}
