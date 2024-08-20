
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

	// Métodos
	public long quantidade() {
		return (ano * 31104000 + mes * 2592000 + dia * 86400);
	}

	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
}
