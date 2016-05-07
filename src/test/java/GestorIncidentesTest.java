import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class GestorIncidentesTest {
  
  @Test
  public void siNotificoDeUnaPersonaViolentaYNoHayObservadoresNoRompe() {
    GestorDeIncidentes gestor = new GestorDeIncidentes();
    IncidentePersonaViolenta incidente = 
        new IncidentePersonaViolenta(
            new Persona("rodolfo", "caputo", "12222222"));

    gestor.registrarIncidentePersonaViolenta(incidente);
    
  }

  @Test
  public void siNotificoDeUnaPersonaViolentaYHayUnaBlackListLaNotifica() {
    GestorDeIncidentes gestor = new GestorDeIncidentes();
    IncidentePersonaViolenta incidente = 
        new IncidentePersonaViolenta(
            new Persona("rodolfo", "caputo", "12222222"));
    
    ImpostorBlackList bl = new ImpostorBlackList();
    
    ObservadorIncidentesListaNegra observador =
        new ObservadorIncidentesListaNegra(bl);
    
    gestor.agregarObservador(observador);
    
    gestor.registrarIncidentePersonaViolenta(incidente);
    
    
    Assert.assertTrue(bl.fuisteNotificado());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
