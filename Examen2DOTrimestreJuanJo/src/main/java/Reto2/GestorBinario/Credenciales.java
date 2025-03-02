package Reto2.GestorBinario;

import java.io.File;
import java.io.Serializable;

public class Credenciales implements Serializable {

    private String url;
    private String puerto;
    private String usuario;
    private String contrasenna;
    private String nombreBBDD;

    public Credenciales(String url, String puerto, String usuario, String contrasenna, String nombreBBDD) {
        this.url = url;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.nombreBBDD = nombreBBDD;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    @Override
    public String toString() {
        return url + puerto + "/" + nombreBBDD;
    }
}