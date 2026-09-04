package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.sysventas.TipoDocuemnto;
@Setter
@Getter
public class Cliente {

    String DNIRUC;
    String nombre;
    String replegal;
    String direccion;
    TipoDocuemnto tipoDocuemnto;

}
