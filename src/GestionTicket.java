import java.util.ArrayList;

public class GestionTicket {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario usuario1 = new Usuario(1, "Ana López", "ana@mail.com");
        Usuario usuario2 = new Usuario(2, "Carlos Ruiz", "carlos@mail.com");

        Tecnico tecnico1 = new Tecnico(1, "Lucía García", "Hardware");
        Tecnico tecnico2 = new Tecnico(2, "Pablo Torres", "Software");

        TicketSoporte t1 = sistema.crearTicket("No enciende la PC", usuario1);
        TicketSoporte t2 = sistema.crearTicket("Error al abrir archivo", usuario2);

        sistema.asignarTecnico(t1.getId(), tecnico1);
        sistema.asignarTecnico(t2.getId(), tecnico2);

        t1.cerrarTicket();

        System.out.println("\n=== Todos los tickets ===");
        sistema.listarTickets();

        System.out.println("\n=== Tickets Abiertos ===");
        sistema.listarTicketsPorEstado(EstadoInicial.ABIERTO);

        System.out.println("\n=== Tickets Cerrados ===");
        sistema.listarTicketsPorEstado(EstadoInicial.CERRADO);
            }
    }
