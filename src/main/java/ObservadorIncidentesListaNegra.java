public class ObservadorIncidentesListaNegra implements ObservadorIncidentes {

  private BlackListSystem blackList; 

  public ObservadorIncidentesListaNegra(
      BlackListSystem blackList) {
    this.blackList = blackList;
  }

  @Override
  public void notificarIncidentePersonaViolenta(IncidentePersonaViolenta incidente) {
    Persona persona = incidente.getPersona();

    blackList.registrarPersona(//
        persona.getNombre(), //
        persona.getApellido(),//
        persona.getDni());
  }

}
