package pe.edu.upeu.lp2g2_clase01.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lp2g2_clase01.dao.RolDao;
import pe.edu.upeu.lp2g2_clase01.entity.Rol;
import pe.edu.upeu.lp2g2_clase01.repository.RolRepository;
@Component
public class RolDaoImpl implements RolDao {

	 @Autowired
	    private RolRepository  repository;
		@Override
		public Rol create(Rol a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public Rol update(Rol a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			repository.deleteById(id);
		
		}

		@Override
		public  Optional<Rol> read(Long id) {
			// TODO Auto-generated method stub
			return repository.findById(id);
		}

		@Override
		public List<Rol> readAll() {
			// TODO Auto-generated method stub
			return repository.findAll();
		}

}
