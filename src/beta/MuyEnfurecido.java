package beta;

public class MuyEnfurecido extends EstadoVikingo {

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
		return 300;
	}

	@Override
	public int getDefensa() {
		return 0;
	}

}
