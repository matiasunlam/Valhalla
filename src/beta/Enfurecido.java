package beta;

public class Enfurecido extends EstadoVikingo {

	@Override
	public EstadoVikingo beber() {
		return new Ebrio();
	}

	@Override
	public EstadoVikingo sacudir() {
		return new MuyEnfurecido();		
	}

	@Override
	public int getFuerza() {
		return 30;
	}

	@Override
	public int getDefensa() {
		return 0;
	}

}
