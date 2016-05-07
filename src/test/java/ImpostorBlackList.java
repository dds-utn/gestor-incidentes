
public class ImpostorBlackList implements BlackListSystem {

  private boolean fuisteNotificado = false;
  
  @Override
  public void registrarPersona(
      String nombre, String apellido, String dni) {
      fuisteNotificado = true;
  }

  public boolean fuisteNotificado() {
    return fuisteNotificado;
  }

}
