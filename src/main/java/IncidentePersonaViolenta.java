
public class IncidentePersonaViolenta implements TipoIncidente {

	private Persona persona;

	@Override
	public void notificarRegistro(ObserverRegistro observer) {
		observer.notificarPersonaViolenta(persona);
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
