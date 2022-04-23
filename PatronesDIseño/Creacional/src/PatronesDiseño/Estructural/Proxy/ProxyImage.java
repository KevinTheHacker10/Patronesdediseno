package PatronesDiseño.Estructural.Proxy;

/**
 *
 * @author Samir, Kevin y Floryan
 */
public class ProxyImage implements Imagen {

    private ImagenP ImagenPrincipal;
    private String ImagenaCargar;

    public ProxyImage(String fileName){
        this.ImagenaCargar = fileName;
    }

    @Override
    public void ecenario() {
        if(ImagenPrincipal == null){
            ImagenPrincipal = new ImagenP(ImagenaCargar);
        }
        ImagenPrincipal.ecenario();
    }

}