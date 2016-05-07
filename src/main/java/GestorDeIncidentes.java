import java.util.ArrayList;
import java.util.List;

public class GestorDeIncidentes {

  public List<IncidentePersonaViolenta> incidentes = new ArrayList<IncidentePersonaViolenta>();

  public List<ObservadorIncidentes> observadores = new ArrayList<>();

  public void registrarIncidentePersonaViolenta(IncidentePersonaViolenta incidente) {
    incidentes.add(incidente);
    for (ObservadorIncidentes b : observadores) {
      b.notificarIncidentePersonaViolenta(incidente);
    }
  }

  public int cantidadIncidentes() {
    return incidentes.size();
  }

  public void agregarObservador(
      ObservadorIncidentes observador) {
    observadores.add(observador);
  }

}












