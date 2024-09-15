package pe.edu.upeu.lp2g2_clase01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2g2_clase01.entity.Genero;
@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{

}
