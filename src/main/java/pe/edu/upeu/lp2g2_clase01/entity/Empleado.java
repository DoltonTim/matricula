package pe.edu.upeu.lp2g2_clase01.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombres", length = 100)
	private String nombres;
	@Column(name = "apellido", length = 100)
	private String apellido;
	@Column(name = "documento", length = 100)
	private String documnto;
	@Column(name = "telefono", length = 100)
	private String telefono;
	@Column(name = "correo", length = 100)
	private String correo;
	@Column(name = "estado")
	private char estado;
	
	@OneToOne(mappedBy = "empleado", optional= true)
	private Usuario usuario;
}
