package pe.edu.upeu.lp2g2_clase01.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lp2g2_clase01.dao.AccesoDao;
import pe.edu.upeu.lp2g2_clase01.entity.Acceso;
import pe.edu.upeu.lp2g2_clase01.entity.Rol;
import pe.edu.upeu.lp2g2_clase01.repository.AccesoRepository;
import pe.edu.upeu.lp2g2_clase01.repository.RolRepository;
@Component
public class AccesoDaoImpl implements AccesoDao {
	@Autowired
	private AccesoRepository repository;
	
	@Autowired
	private RolRepository repository1;

	private Long accesoId;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a); 
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	

	

	@Override
	public Acceso registarAcceroRol(Long accedoId, Long rolId) {
		// TODO Auto-generated method stub
		Acceso ac = repository.findById(accesoId).get();
		Rol rol = repository1.findById(rolId).get();
		ac.getRoles().add(rol);
		rol.getAccesos().add(ac);
		return repository.save(ac);
	}


	

}