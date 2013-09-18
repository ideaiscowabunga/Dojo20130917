package br.com.ideais.cowabunga.assassino.enums;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SuspeitoEnumTests {

	@Test
	public void enumConstruction() {
		assertEquals( Integer.valueOf(1), SuspeitoEnum.CHARLES.getId() );
		assertEquals( "Charles B. Abbage", SuspeitoEnum.CHARLES.getNome() );
	}
	
	@Test
	public void retornaSeisSuspeitos(){
		assertEquals(6, SuspeitoEnum.values().length);
	}

}
