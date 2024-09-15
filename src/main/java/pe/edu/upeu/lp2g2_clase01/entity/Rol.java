package pe.edu.upeu.lp2g2_clase01.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre",length =100)
	private String nombre;
	@Column(name="estado")
	private char  estado;	
	
	@ManyToMany(mappedBy = "roles")
	private Set<Acceso>accesos;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Usuario>usuarios;
}
