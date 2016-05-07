import java.util.ArrayList;
import java.util.List;

public class GestorDeIncidentes {

  private List<IncidentePersonaViolenta> incidentes = new ArrayList<IncidentePersonaViolenta>();

  private List<ObservadorIncidentes> observadores = new ArrayList<>();

  private FuenteDeIncidentes fuenteDeIncidentes;
  
  public GestorDeIncidentes(FuenteDeIncidentes fuenteDeIncidentes) {
    this.fuenteDeIncidentes = fuenteDeIncidentes;
  }

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



  public void actualizarIncidentes() {
    registrarIncidentePersonaViolenta(
        fuenteDeIncidentes.obtenerNuevoIncidentePersonaViolenta());
  }

}












