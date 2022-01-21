package customLinkedList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

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
	
	@Test
	public void should_remove_first_elements_to_linkedlist()
	{
		// arrange
		LinkedList<String> sut = new LinkedList<String>();
		
		// add
		sut.add("One");
		sut.add("Two");
		sut.add("Three");
		sut.add("Forth");
		
		//remove
		sut.remove("One");
		
		//assert
		assertNull(sut.get("One"));		
		assertThat(sut.get("Two"), is("Two"));		
		assertThat(sut.get("Three"), is("Three"));		
		assertThat(sut.get("Forth"), is("Forth"));		
	}	
	
	@Test
	public void should_remove_middle_elements_to_linkedlist()
	{
		// arrange
		LinkedList<String> sut = new LinkedList<String>();
		
		// add
		sut.add("One");
		sut.add("Two");
		sut.add("Three");
		sut.add("Forth");
		
		//remove
		sut.remove("Two");
		
		//assert
		assertThat(sut.get("One"), is("One"));		
		assertNull(sut.get("Two"));		
		assertThat(sut.get("Three"), is("Three"));		
		assertThat(sut.get("Forth"), is("Forth"));		
	}	

	@Test
	public void should_remove_last_elements_to_linkedlist()
	{
		// arrange
		LinkedList<String> sut = new LinkedList<String>();
		
		// add
		sut.add("One");
		sut.add("Two");
		sut.add("Three");
		sut.add("Forth");
		
		//remove
		sut.remove("Forth");

		//add
		sut.add("Fifth");
		sut.add("Sixth");
		
		//assert
		assertThat(sut.get("One"), is("One"));		
		assertThat(sut.get("Two"), is("Two"));		
		assertThat(sut.get("Three"), is("Three"));		
		assertNull(sut.get("Forth"));		
		assertThat(sut.get("Fifth"), is("Fifth"));		
		assertThat(sut.get("Sixth"), is("Sixth"));		

	}	

}
