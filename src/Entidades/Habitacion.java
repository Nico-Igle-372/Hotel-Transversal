
package Entidades;

public class Habitacion {
    
    private Habitacion habitacion;
    private TipoHabitacion tipoHabitacion;
    private boolean estado;  

    public Habitacion(Habitacion habitacion, TipoHabitacion tipoHabitacion, boolean estado) {
        this.habitacion = habitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

  

    public Habitacion() {
    }
    
    
    
}
