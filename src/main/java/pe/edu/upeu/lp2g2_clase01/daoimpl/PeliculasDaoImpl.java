package pe.edu.upeu.lp2g2_clase01.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lp2g2_clase01.dao.PeliculasDao;
import pe.edu.upeu.lp2g2_clase01.entity.Peliculas;
import pe.edu.upeu.lp2g2_clase01.repository.PeliculasRepository;
@Component
public class PeliculasDaoImpl   implements PeliculasDao {

	 @Autowired
	    private PeliculasRepository  repository;
		@Override
		public Peliculas create(Peliculas a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public Peliculas update(Peliculas a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			repository.deleteById(id);
		
		}

		@Override
		public  Optional<Peliculas> read(Long id) {
			// TODO Auto-generated method stub
			return repository.findById(id);
		}

		@Override
		public List<Peliculas> readAll() {
			// TODO Auto-generated method stub
			return repository.findAll();
		}
}
