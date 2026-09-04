package pe.edu.upeu.sysventas;

public enum TipoPoducto {
 PRODUCTO("PRODUCTO"),
 PREPEARADO("preparado"),
 SERVICIO("servicio");

    String descripcion;
    TipoPoducto(String descripcion){
        this.descripcion=descripcion;
    }
}
