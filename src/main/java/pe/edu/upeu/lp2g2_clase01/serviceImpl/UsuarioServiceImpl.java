package pe.edu.upeu.lp2g2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2g2_clase01.entity.Usuario;
import pe.edu.upeu.lp2g2_clase01.repository.UsuarioRepository;
import pe.edu.upeu.lp2g2_clase01.service.UsuarioService;

@Service
public class UsuarioServiceImpl  implements UsuarioService{
  @Autowired
  private UsuarioRepository UsuariosRepository;
	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return UsuariosRepository.save(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return UsuariosRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		UsuariosRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return UsuariosRepository.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return UsuariosRepository.findAll();
	}

}
