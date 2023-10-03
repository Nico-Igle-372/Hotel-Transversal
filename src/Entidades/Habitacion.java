
package Entidades;

public class Habitacion {
    
    private int idhabitacion;
    private TipoHabitacion tipoHabitacion;
    private boolean estado;  

    public Habitacion() {
    }

    public Habitacion(int idhabitacion, TipoHabitacion tipoHabitacion, boolean estado) {
        this.idhabitacion = idhabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

    public int getidhabitacion() {
        return idhabitacion;
    }

    public void setiDhabitacion(int iDhabitacion) {
        this.idhabitacion = iDhabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idhabitacion=" + idhabitacion + ", tipoHabitacion=" + tipoHabitacion + ", estado=" + estado + '}';
    }

  
}
   
    
    

