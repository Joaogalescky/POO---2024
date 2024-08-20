
public class Data extends Tempo {
	// Atributos
	private Integer dia;
	private Integer mes;
	private Integer ano;

	// Construtores
	public Data() {
	}

	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Getters e Setters
	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getDia() {
		return dia;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getMes() {
		return mes;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	// Métodos
	public long quantidade() {
		return (ano * 31104000 + mes * 2592000 + dia * 86400);
	}

	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
}
