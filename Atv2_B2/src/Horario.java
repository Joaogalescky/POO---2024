
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

	// Getters e Setters
	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}

	public Integer getSegundo() {
		return segundo;
	}

	// Métodos
	public long quantidade() {
		return (hora * 3600 + minuto * 60 + segundo);
	}

	public String toString() {
		return (hora + ":" + minuto + ":" + segundo);
	}
}
