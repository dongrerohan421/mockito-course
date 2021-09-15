package com.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	void testRetrieveTodosRelatedToSpring_UsingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

		assertEquals(2, filteredTodos.size());
		assertEquals("Learn Spring MVC", filteredTodos.get(0));
		assertEquals("Learn Spring", filteredTodos.get(1));
	}

}
