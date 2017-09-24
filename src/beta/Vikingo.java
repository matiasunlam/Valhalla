package beta;

public class Vikingo {

	private int ataque = 10;
	private int defensa = 5;
	private int salud = 100;
	private boolean ebrio = false;
	private boolean enfurecido = false;
	private EstadoVikingo estado = new Normal();
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public boolean isEbrio() {
		return ebrio;
	}
	public void setEbrio(boolean ebrio) {
		this.ebrio = ebrio;
	}
	public boolean isEnfurecido() {
		return enfurecido;
	}
	public void setEnfurecido(boolean enfurecido) {
		this.enfurecido = enfurecido;
	}
	public void atacar(Vikingo atacado) {
		estado.atacar(this, atacado);
	}
	
	public void beber() {
		estado = estado.beber();
		defensa = estado.getDefensa();
		ataque = estado.getFuerza();
	}
	public void sacudir() {
		estado = estado.sacudir();
		defensa = estado.getDefensa();
		ataque = estado.getFuerza();
	}
	
	
	

}


/*	public int getAtaque() {
return ataque;
}
public void setAtaque(int ataque) {
this.ataque = ataque;
}
public int getDefensa() {
return defensa;
}
public void setDefensa(int defensa) {
this.defensa = defensa;
}
public int getSalud() {
return salud;
}
public void setSalud(int salud) {
this.salud = salud;
}

public boolean isEbrio() {
return ebrio;
}
public void setEbrio(boolean ebrio) {
this.ebrio = ebrio;

if (ebrio == true)
{
	this.ataque = 7;
	this.defensa = 2;
}

if (ebrio == false)
{
	this.ataque = 10;
	this.defensa = 2;
}

}
public boolean isEnfurecido() {
return enfurecido;
}
public void setEnfurecido(boolean enfurecido) {
this.enfurecido = enfurecido;
}

public void atacar(Vikingo v2) {
int ataque;

ataque = this.getAtaque() - v2.getDefensa();

if (ataque < 0)
	ataque = 0;

v2.setSalud(v2.getSalud() - ataque);
}

public void beberHidromiel() {
setEbrio(true);
}

public void sacudir() {
if (this.isEnfurecido() == true)
{
	this.setAtaque(1000);
	return;
}

if (this.isEbrio() == true)
{
	setEbrio(false);
}
else
{
	this.setAtaque(30);
	this.setDefensa(0);
}
}*/