package beta;

public abstract class EstadoVikingo {

	public abstract int getFuerza();
	public abstract int getDefensa();
	public abstract EstadoVikingo beber();
	public abstract EstadoVikingo sacudir();
	
	public void atacar(Vikingo atacante, Vikingo atacado) {
		int fuerza = atacante.getAtaque();
		int defensa = atacado.getDefensa();
		int salud = atacado.getSalud();
		
		int ataque = fuerza - defensa;
		if (ataque < 0)
			ataque = 0;
		
		salud = salud - ataque;
		if (salud < 0)
			salud = 0;
		
		atacado.setSalud(salud);
	}
}
