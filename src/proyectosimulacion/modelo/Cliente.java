
package proyectosimulacion.modelo;

public class Cliente {    
    
    private String numCliente;
    private String momentoLllegada;
    private String tiempoInicio;
    private String tiempoAtencion;
    private String tiempoSalida;

    public Cliente() {
    }

    public Cliente(String numCliente, String momentoLllegada, String tiempoInicio, String tiempoAtencion) {
        this.numCliente = numCliente;
        this.momentoLllegada = momentoLllegada;
        this.tiempoInicio = tiempoInicio;
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    
        

    public String getMomentoLllegada() {
        return momentoLllegada;
    }

    public void setMomentoLllegada(String momentoLllegada) {
        this.momentoLllegada = momentoLllegada;
    }

    public String getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(String tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public String getTiempoAtencion() {
        return tiempoAtencion;
    }

    public void setTiempoAtencion(String tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(String tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    @Override
    public String toString() {
        return numCliente + ", momentoLllegada: " + momentoLllegada + ", tiempoInicio:" + tiempoInicio + ", tiempoAtencion: " + tiempoAtencion + ", tiempoSalida: " + tiempoSalida;
    }
    

    
    
    
}
