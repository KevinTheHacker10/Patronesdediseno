package PatronesDiseño.Estructural.Proxy;

/**
 *
 * @author Samir, Kevin y Floryan
 */

public class ImagenP implements Imagen {

    private String ArchivoImagen;

    public ImagenP(String NombreIMGArchivo){
        this.ArchivoImagen = NombreIMGArchivo;
        CargarDisco(NombreIMGArchivo);
    }

    @Override
    public void ecenario() {
        System.out.println("Exhibiendo " + ArchivoImagen);
    }

    private void CargarDisco(String ImagenaCargar){
        System.out.println("Cargando " + ImagenaCargar);
    }

}