package pe.edu.upeu.lp2g2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lp2g2_clase01.entity.Renta;

public interface RentaService {
	Renta create(Renta a);
	Renta update(Renta a);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta> readAll();
}
