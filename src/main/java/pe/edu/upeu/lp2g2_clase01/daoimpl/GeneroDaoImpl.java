package pe.edu.upeu.lp2g2_clase01.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lp2g2_clase01.dao.GeneroDao;
import pe.edu.upeu.lp2g2_clase01.entity.Genero;
import pe.edu.upeu.lp2g2_clase01.repository.GeneroRepository;

@Component
public class GeneroDaoImpl implements GeneroDao {

	 @Autowired
	    private GeneroRepository  repository;
		@Override
		public Genero create(Genero a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public Genero update(Genero a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			repository.deleteById(id);
		
		}

		@Override
		public  Optional<Genero> read(Long id) {
			// TODO Auto-generated method stub
			return repository.findById(id);
		}

		@Override
		public List<Genero> readAll() {
			// TODO Auto-generated method stub
			return repository.findAll();
		}
}
