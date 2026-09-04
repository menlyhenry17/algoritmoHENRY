package pe.edu.upeu.sysventas.model;

import lombok.Data;
import pe.edu.upeu.sysventas.Menus;
import pe.edu.upeu.sysventas.enums.TipoTap;
@Data

public class Acceso {
    String idAcceso;
    String urlAcceso;
    String menultemNombre;
    Menus menuNombre;
    TipoTap nombreTap;

}
