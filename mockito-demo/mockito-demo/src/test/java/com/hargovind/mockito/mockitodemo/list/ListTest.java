package com.hargovind.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {

	@Test
	void simpleTest() {
		
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(3);
		
		assertEquals(3,listMock.size());
	}
	
	@Test
	void multipleReturns() {
		
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(3).thenReturn(2);
		
		assertEquals(3,listMock.size());
		assertEquals(2,listMock.size());
	}
	
	@Test
	void parameters() {
		
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("Some String").thenReturn("Hargovind");
		
		assertEquals("Some String",listMock.get(0));
		assertEquals("Hargovind",listMock.get(0));
		assertEquals("Hargovind",listMock.get(0));
		assertEquals("Hargovind",listMock.get(0));
//		assertEquals("Some String",listMock.get(0));
	}
}
