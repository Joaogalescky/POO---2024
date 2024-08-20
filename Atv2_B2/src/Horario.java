public class Horario extends Tempo {
	// Atributos
	private Integer hora;
	private Integer minuto;
	private Integer segundo;

	// Construtores
	public Horario() {
	}

	public Horario(Integer hora, Integer minuto, Integer segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	// Métodos
	public long quantidade() {
		return (hora * 3600 + minuto * 60 + segundo);
	}

	public String toString() {
		return (hora + ":" + minuto + ":" + segundo);
	}
}
