package br.com.samuelengcomp.planReforma.entidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Reforma {

	
	private Integer codigo;
	private LocalDateTime data;
	private String descricao;
	private Categoria categoria;
	private BigDecimal valor;
	private BigDecimal totalPrevisto;
	
	//valores calculados - transientes
	private BigDecimal totalGasto;
	private BigDecimal totalGastoMaterial;
	private BigDecimal totalGastoMaoDeObra;
	private BigDecimal saldo;
	
	
}
