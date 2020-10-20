package com.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void testLetsMockListSizeMethod() {
		List<Integer> listMock = mock(List.class);

		when(listMock.size()).thenReturn(2);

		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}

	@Test
	void testLetsMockListSizeMethod_ReturnMultipleValues() {
		List<Integer> listMock = mock(List.class);

		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(5);

		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(5, listMock.size());
	}

	@Test
	void testLetsMockListGetMethod() {
		List<String> listMock = mock(List.class);

		when(listMock.get(0)).thenReturn("GetMethod");

		assertEquals("GetMethod", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	void testLetsMockListGetMethod_WithArgumentMatcher() {
		List<String> listMock = mock(List.class);

		// Argument Matcher
		when(listMock.get(anyInt())).thenReturn("GetMethod");

		assertEquals("GetMethod", listMock.get(0));
		assertEquals("GetMethod", listMock.get(1));
	}
}
