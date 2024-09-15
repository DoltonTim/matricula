package pe.edu.upeu.lp2g2_clase01.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.lp2g2_clase01.dao.RentaDao;
import pe.edu.upeu.lp2g2_clase01.entity.Renta;

import pe.edu.upeu.lp2g2_clase01.repository.RentaRepository;
@Component
public class RentaDaoImpl implements RentaDao{

	 @Autowired
	    private RentaRepository  repository;
		@Override
		public Renta create(Renta a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public Renta update(Renta a) {
			// TODO Auto-generated method stub
			return repository.save(a);
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			repository.deleteById(id);
		
		}

		@Override
		public  Optional<Renta> read(Long id) {
			// TODO Auto-generated method stub
			return repository.findById(id);
		}

		@Override
		public List<Renta> readAll() {
			// TODO Auto-generated method stub
			return repository.findAll();
		}
}
