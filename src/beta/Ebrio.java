package beta;

public class Ebrio extends EstadoVikingo {

	@Override
	public EstadoVikingo beber() {
		return new Ebrio();		
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Normal();
	}

	@Override
	public int getFuerza() {
		return 7;
	}

	@Override
	public int getDefensa() {
		return 2;
	}

}
