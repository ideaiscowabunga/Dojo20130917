package br.com.ideais.cowabunga.assassino.enums;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArmaEnumTests {

	@Test
	public void enumConstruction() {
		assertEquals( Integer.valueOf(1), ArmaEnum.PEIXEIRA.getId() );
		assertEquals( "Peixeira", ArmaEnum.PEIXEIRA.getNome() );
	}
	
	@Test
	public void retornaSeisSuspeitos(){
		assertEquals(6, ArmaEnum.values().length);
	}

}
