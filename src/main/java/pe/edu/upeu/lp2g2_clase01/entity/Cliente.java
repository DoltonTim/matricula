package pe.edu.upeu.lp2g2_clase01.entity;

import java.sql.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre", length = 100)
	private String nombre;
	@Column(name = "apellido", length = 100)
	private String apellido;
	@Column(name = "fecha_nac", length = 100)
	@Temporal(TemporalType.DATE)
	private Date fecha_nac;
	@Column(name = "estado")
	private char estado;
	

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "cliente")
@JsonIgnore
private Set<Renta> rentas;

}
