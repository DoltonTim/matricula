package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lp2g2_clase01.entity.Acceso;

public interface AccesoDao {
Acceso create(Acceso a);
Acceso update(Acceso a);
void delete(Long id);
Optional<Acceso>  read(Long id);
List<Acceso>readAll();
Acceso registarAcceroRol(Long accedoId,Long rolId);

}
