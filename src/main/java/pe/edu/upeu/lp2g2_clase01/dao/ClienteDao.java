package pe.edu.upeu.lp2g2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.lp2g2_clase01.entity.Cliente;

public interface ClienteDao {
	Cliente create(Cliente a);
	Cliente update(Cliente a);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente>readAll();
}
