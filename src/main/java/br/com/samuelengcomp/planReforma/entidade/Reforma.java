package br.com.samuelengcomp.planReforma.entidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "reforma")
public class Reforma {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "data_registro", nullable = false)
	private LocalDateTime dataRegistro;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	//finalizar isso aqui
	@OneToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "total_previsto")
	private BigDecimal totalPrevisto;
	
	//valores calculados
	@Column(name = "total_gasto")
	private BigDecimal totalGasto;
	
	@Column(name = "total_gasto_material")
	private BigDecimal totalGastoMaterial;
	
	@Column(name = "total_gasto_mao_de_obra")
	private BigDecimal totalGastoMaoDeObra;
	
	@Column(name = "saldo")
	private BigDecimal saldo;

	public Reforma() {
		super();
	}

	public Reforma(Integer id, LocalDateTime dataRegistro, String descricao, Categoria categoria, BigDecimal valor,
			BigDecimal totalPrevisto, BigDecimal totalGasto, BigDecimal totalGastoMaterial,
			BigDecimal totalGastoMaoDeObra, BigDecimal saldo) {
		super();
		this.id = id;
		this.dataRegistro = dataRegistro;
		this.descricao = descricao;
		this.categoria = categoria;
		this.valor = valor;
		this.totalPrevisto = totalPrevisto;
		this.totalGasto = totalGasto;
		this.totalGastoMaterial = totalGastoMaterial;
		this.totalGastoMaoDeObra = totalGastoMaoDeObra;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getTotalPrevisto() {
		return totalPrevisto;
	}

	public void setTotalPrevisto(BigDecimal totalPrevisto) {
		this.totalPrevisto = totalPrevisto;
	}

	public BigDecimal getTotalGasto() {
		return totalGasto;
	}

	public void setTotalGasto(BigDecimal totalGasto) {
		this.totalGasto = totalGasto;
	}

	public BigDecimal getTotalGastoMaterial() {
		return totalGastoMaterial;
	}

	public void setTotalGastoMaterial(BigDecimal totalGastoMaterial) {
		this.totalGastoMaterial = totalGastoMaterial;
	}

	public BigDecimal getTotalGastoMaoDeObra() {
		return totalGastoMaoDeObra;
	}

	public void setTotalGastoMaoDeObra(BigDecimal totalGastoMaoDeObra) {
		this.totalGastoMaoDeObra = totalGastoMaoDeObra;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, dataRegistro, descricao, id, saldo, totalGasto, totalGastoMaoDeObra,
				totalGastoMaterial, totalPrevisto, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reforma other = (Reforma) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(dataRegistro, other.dataRegistro)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(saldo, other.saldo) && Objects.equals(totalGasto, other.totalGasto)
				&& Objects.equals(totalGastoMaoDeObra, other.totalGastoMaoDeObra)
				&& Objects.equals(totalGastoMaterial, other.totalGastoMaterial)
				&& Objects.equals(totalPrevisto, other.totalPrevisto) && Objects.equals(valor, other.valor);
	}
	
	
}
