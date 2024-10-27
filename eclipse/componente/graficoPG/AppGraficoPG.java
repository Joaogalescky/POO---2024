package componente.graficoPG;

import componente.grafico.*;
import componente.sequencia.*;

public class AppGraficoPG {

	public static void main(String[] args) {
		IProgressaoGeometrica pg = new ProgressaoGeometrica();
		
		pg.setVi(1);
		pg.setRz(2);
		
		IGrafico g = new Grafico();
		
		g.setPreenchido(true);
		g.setCaracter('$');
		g.setN(5);
		
		g.connect(pg);
		g.plot();
	}

}
