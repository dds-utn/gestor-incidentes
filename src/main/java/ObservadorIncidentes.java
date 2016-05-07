
public interface ObservadorIncidentes {

  void notificarIncidentePersonaViolenta(
      IncidentePersonaViolenta incidente);

  void notificarIncidenteIncendio(
      IncidenteIncendio incidente);
}
