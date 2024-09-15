package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;


import pe.edu.upeu.lp2g2_clase01.entity.Peliculas;

public interface PeliculasDao {
	Peliculas create(Peliculas a);
	Peliculas update(Peliculas a);
	void delete(Long id);
	Optional<Peliculas>  read(Long id);
	List<Peliculas>readAll();
}
