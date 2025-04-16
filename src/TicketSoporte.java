import java.time.LocalDate;
import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private LocalDate fecha;
    private EstadoInicial estadoTicket;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.estadoTicket = EstadoInicial.ABIERTO;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.estadoTicket = EstadoInicial.ABIERTO;
        this.usuario = usuario;
    }

    public EstadoInicial getEstadoTicket() {
        return estadoTicket;
    }

    public void asignarTecnico(String tecnico){

        this.tecnico = tecnico;
    }

    public void cerrarTicket(){
        estadoTicket = EstadoInicial.CERRADO;
    }

    public void ticketEnProceso(){
        estadoTicket = EstadoInicial.EN_PROCESO;
    }



    public String mostrarDetalle() {
        return "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estadoTicket +
                "\nFecha de creación: " + fecha +
                (usuario != null ? "\nUsuario: " + usuario : "") +
                (tecnico != null ? "\nTécnico asignado: " + tecnico : "");
    }
}
