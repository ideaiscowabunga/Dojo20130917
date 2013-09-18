package br.com.ideais.cowabunga.assassino.enums;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LocalEnumTests {

	@Test
	public void enumConstruction() {
		assertEquals( Integer.valueOf(1), LocalEnum.REDMOND.getId() );
		assertEquals( "Redmond", LocalEnum.REDMOND.getNome() );
	}
	
	@Test
	public void retornaDezLocais(){
		assertEquals(10, LocalEnum.values().length);
	}

}
