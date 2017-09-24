package beta;

import org.junit.Assert;
import org.junit.Test;

public class VikingoTests {

	@Test
	public void queAtaca() {
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		
		v2.atacar(v1);
		Assert.assertEquals(v1.getSalud(), 95);
	}
	
	@Test
	public void queAtacaPeorBorracho() {
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		
		v2.beber();
		
		v2.atacar(v1);
		Assert.assertEquals(v1.getSalud(), 98);
	}
	
	@Test
	public void queSePoneSobrioSiLoSacudenEbrio() {
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		
		v1.beber();
		v1.sacudir();
		
		v1.atacar(v2);
		Assert.assertEquals(v2.getSalud(), 95);
	}
	
	@Test
	public void queSeEnojaSiLoSacudenSobrio() {
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		
		v1.sacudir();
		
		v1.atacar(v2);
		Assert.assertEquals(v2.getSalud(), 75);
	}
	
	@Test
	public void queSeEnojaMasSiLoSacudenEnojado() {
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		
		v1.sacudir();
		v1.sacudir();
				
		v1.atacar(v2);
		Assert.assertEquals(v2.getSalud(), 0);
	}
	
}
