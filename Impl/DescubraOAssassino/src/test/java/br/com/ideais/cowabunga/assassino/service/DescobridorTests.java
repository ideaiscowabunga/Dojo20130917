package br.com.ideais.cowabunga.assassino.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.ideais.cowabunga.assassino.enums.ArmaEnum;
import br.com.ideais.cowabunga.assassino.enums.LocalEnum;
import br.com.ideais.cowabunga.assassino.enums.SuspeitoEnum;

@RunWith(JUnit4.class)
public class DescobridorTests {

	private Descobridor descobridor;
	
	@Before
	public void setUp(){
		descobridor = new Descobridor(SuspeitoEnum.CHARLES, LocalEnum.MILLIWAYS, ArmaEnum.DYNATAC);
	}
	
	@Test
	public void palpiteCorreto() throws Exception {
		assertEquals( Integer.valueOf(0), descobridor.palpite( SuspeitoEnum.CHARLES, LocalEnum.MILLIWAYS, ArmaEnum.DYNATAC ) );
	}
	
	@Test
	public void palpiteSuspeitoIncorreto() throws Exception {
		assertEquals( Integer.valueOf(1), descobridor.palpite( SuspeitoEnum.ADA, LocalEnum.MILLIWAYS, ArmaEnum.DYNATAC ) );
	}
	
	@Test
	public void palpiteLocalIncorreto() throws Exception {
		assertEquals( Integer.valueOf(2), descobridor.palpite( SuspeitoEnum.CHARLES, LocalEnum.TOKIO, ArmaEnum.DYNATAC ) );
	}
	
	@Test
	public void palpiteArmaIncorreta() throws Exception {
		assertEquals( Integer.valueOf(3), descobridor.palpite( SuspeitoEnum.CHARLES, LocalEnum.MILLIWAYS, ArmaEnum.GLADIO ) );
	}
	
	@Test
	public void todosIncorretos() throws Exception {
		List<Integer> possiveisErros = Arrays.asList(1, 2, 3);
		Integer palpite = descobridor.palpite(SuspeitoEnum.DONALD, LocalEnum.CUPERTINO, ArmaEnum.MACA);
		assertTrue(possiveisErros.contains(palpite));
	}
	
}
