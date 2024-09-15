package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.lp2g2_clase01.entity.Usuario ;

public interface UsuarioDao {
Usuario  create(Usuario  a);
Usuario  update(Usuario  a);
void delete(Long id);
Optional<Usuario>  read(Long id);
List<Usuario >readAll();

}
