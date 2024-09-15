package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.lp2g2_clase01.entity.Renta;

public interface RentaDao {
	Renta create(Renta a);
	Renta update(Renta a);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta>readAll();
}
