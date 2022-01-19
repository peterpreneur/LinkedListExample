package customLinkedList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void should_add_new_element_to_linkedlist() 
	{
		// arrange
		LinkedList<String> sut = new LinkedList<String>();
		
		// act
		sut.add("One");
		
		// assert
		assertThat(sut.get("One"),is("One"));
		
	}
	
	@Test
	public void should_add_multiple_elements_to_linkedlist()
	{
		// arrange
		LinkedList<String> sut = new LinkedList<String>();
		
		// add
		sut.add("One");
		sut.add("Two");
		sut.add("Three");
		sut.add("Forth");
		
		//assert
		assertThat(sut.get("One"), is("One"));		
		assertThat(sut.get("Two"), is("Two"));		
		assertThat(sut.get("Three"), is("Three"));		
		assertThat(sut.get("Forth"), is("Forth"));		

	}
}
