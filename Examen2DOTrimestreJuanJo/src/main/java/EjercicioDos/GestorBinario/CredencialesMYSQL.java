package EjercicioDos.GestorBinario;

import java.io.Serializable;

public class CredencialesMYSQL implements Serializable {
    protected String url;
    protected String nombreBBDD;
    protected String puerto;
    protected String usuario;
    protected String contrasenna;

    public CredencialesMYSQL(String url, String nombreBBDD, String puerto, String usuario, String contrasenna) {
        this.url = url;
        this.nombreBBDD = nombreBBDD;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }
    public CredencialesMYSQL(){

    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    @Override
    public String toString() {
        return  url +nombreBBDD ;
    }
}
