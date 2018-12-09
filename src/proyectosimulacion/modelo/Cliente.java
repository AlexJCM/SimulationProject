
package proyectosimulacion.modelo;

public class Cliente {    
    
    private String numCliente;
    private String momentoLllegada;
    private String tiempoInicio;
    private String tiempoEspera;
    private String tiempoAtencion;
    private String tiempoSalida;
    private String estado;
    

    public Cliente() {
    }

    public Cliente(String numCliente, String momentoLllegada, String tiempoInicio, String tiempoEspera, String tiempoAtencion, String tiempoSalida, String estado) {
        this.numCliente = numCliente;
        this.momentoLllegada = momentoLllegada;
        this.tiempoInicio = tiempoInicio;
        this.tiempoEspera = tiempoEspera;
        this.tiempoAtencion = tiempoAtencion;
        this.tiempoSalida = tiempoSalida;
        this.estado = estado;
    }

    public String getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(String tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        return "numCliente= " + numCliente + ", momentoLllegada=" + momentoLllegada + ", tiempoInicio=" + tiempoInicio + ", tiempoEspera=" + tiempoEspera + ", tiempoAtencion=" + tiempoAtencion + ", tiempoSalida=" + tiempoSalida + ", estado=" + estado + '}';
    }

   
    

    
    
    
}
