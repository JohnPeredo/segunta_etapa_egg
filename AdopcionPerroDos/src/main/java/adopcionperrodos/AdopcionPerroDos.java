

package adopcionperrodos;

import entities.Perro;
import entities.Persona;
import java.util.*;
import services.AdopcionService;

/**
 *
 * @author Sebastian
 */
public class AdopcionPerroDos {

    public static void main(String[] args) {
        AdopcionService servicio = new AdopcionService();
        HashSet<Perro> perros = new HashSet<>();
        ArrayList<Persona> personas = new ArrayList<>();
        
        servicio.menu(personas, perros);
    }
}
