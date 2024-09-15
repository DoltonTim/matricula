package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;


import pe.edu.upeu.lp2g2_clase01.entity.Rol;

public interface RolDao {
Rol create(Rol a);
Rol update(Rol a);
void delete(Long id);
Optional<Rol>  read(Long id);
List<Rol>readAll();

}
