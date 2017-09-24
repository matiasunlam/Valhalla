package beta;

public class Normal extends EstadoVikingo {

	@Override
	public EstadoVikingo beber() {
		return new Ebrio();
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Enfurecido();		
	}

	@Override
	public int getFuerza() {
		return 10;
	}

	@Override
	public int getDefensa() {
		return 5;
	}

}
