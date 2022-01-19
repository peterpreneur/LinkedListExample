package customLinkedList;

import customLinkedList.Node;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public void add(T element) {
		Node<T> newNode = new Node<T>(element, null);

		// if the linkedList is empty
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public T get(T element) {
		if (head.getElement().equals(element)) {
			return head.getElement();
		} else {

			Node<T> current = head.getNext();

			while (current.getNext() != null) {
				if (current.getElement().equals(element)) {
					return current.getElement();
				}
				current = current.getNext();
			}

			if (current.getElement().equals(element)) {
				return current.getElement();
			}
		}
		return null;
	}
}
