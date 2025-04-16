import java.util.ArrayList;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> tickets;
    private static int contadorTickets = 0;


    public SistemaSoporte(){
        tickets = new ArrayList<>();
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario){
        contadorTickets++;
        TicketSoporte nuevo = new TicketSoporte(contadorTickets, descripcion, usuario);
        tickets.add(nuevo);
        return nuevo;
    }

    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == idTicket) {
                ticket.asignarTecnico(tecnico.getNombre());
                break;
            }
        }
    }

    public void listarTickets() {
        for (TicketSoporte t : tickets) {
            System.out.println("---------------");
            System.out.println(t.mostrarDetalle());
        }
    }

    public void listarTicketsPorEstado(EstadoInicial estadoBuscado) {
        for (TicketSoporte t : tickets) {
            if (t.getEstadoTicket() == estadoBuscado) {
                System.out.println(t.mostrarDetalle());
                System.out.println("---------------");
            }
        }
    }
}
