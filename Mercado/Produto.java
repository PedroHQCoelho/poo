package aulas;

public abstract class Produto implements Venda {
	private String nome;
	private Double valor;
	private Integer quantidadeDeItens;
	
	public Produto(String nome, Double valor, Integer quantidadeDeItens) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Integer getQuantidadeDeItens() {
		return quantidadeDeItens;
	}


	public void setQuantidadeDeItens(Integer quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
		
	@Override
	public double vender(Integer quantidadeDeItens) {
		return getQuantidadeDeItens() * getValor();
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %s - Preço Unidade: R$ %.2f - Quantidade: %d - Valor: R$ %.2f", getNome(), getValor(), getQuantidadeDeItens(), vender(quantidadeDeItens));
	}
	
}
