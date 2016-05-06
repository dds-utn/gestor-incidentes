import java.util.ArrayList;
import java.util.List;



public class GestorDeIncidentes {
	
	List<ObserverRegistro> observers = new ArrayList<>();
	private List<TipoIncidente> incidentes = new ArrayList<>();
	
	public void registrar(TipoIncidente incidente) {
		this.registrarEnSistema(incidente);
		observers.stream().forEach(observer -> incidente.notificarRegistro(observer));
	}

	private void registrarEnSistema(TipoIncidente incidente) {
		incidentes.add(incidente);
	}

	public void registrarObserver(ObserverRegistro observer) {
		this.observers.add(observer);
	}

	public int cantidadIncidentes() {
		return incidentes.size();
	};
	
}
