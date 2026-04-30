
public class claseAnidada {
    /**
	 * 
	 */
	private final FicheroAleatorioVentana claseAnidada;

	/**
	 * @param ficheroAleatorioVentana
	 */
	claseAnidada(FicheroAleatorioVentana ficheroAleatorioVentana) {
		claseAnidada = ficheroAleatorioVentana;
	}

	void entrada() {
        System.out.println("Método entrada.");
    }

    String salida (int d) {
        System.out.println("Salida.");
        return "Salida el " + d;
    }
} // fin clase anidada