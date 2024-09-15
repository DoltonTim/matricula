package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.lp2g2_clase01.entity.Genero;

public interface GeneroDao {
	Genero create(Genero a);
	Genero update(Genero a);
	void delete(Long id);
	Optional<Genero>  read(Long id);
	List<Genero>readAll();
}
