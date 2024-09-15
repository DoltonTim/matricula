package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.lp2g2_clase01.entity.Empleado;

public interface EmpleadoDao {
Empleado create(Empleado a);
Empleado update(Empleado a);
void delete(Long id);
Optional<Empleado> read(Long id);
List<Empleado>readAll();

}
