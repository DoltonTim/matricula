package pe.edu.upeu.lp2g2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2g2_clase01.dao.PeliculasDao;
import pe.edu.upeu.lp2g2_clase01.entity.Peliculas;
import pe.edu.upeu.lp2g2_clase01.service.PeliculaService;

@Service
public class PeliculasServiceImpl  implements PeliculaService{
@Autowired
private PeliculasDao dao;
	@Override
	
	public Peliculas create(Peliculas a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Peliculas update(Peliculas a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stu
		dao.delete(id);
	}

	@Override
	public Optional<Peliculas> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Peliculas> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
 
	

}
