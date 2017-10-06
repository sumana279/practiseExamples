package com.DataStruc.LinkedList;

public class LinkList {
	private Link firstLink;
	 Link reverseLink;
	 Link prev;

	public LinkList() {
		this.firstLink = null;
	}

	public Link getFirstLink() {
		return firstLink;
	}

	public void setFirstLink(Link firstLink) {
		this.firstLink = firstLink;
	}

	public void insertLink(int data) {

		Link newLink = new Link(data);

		newLink.next = getFirstLink();
		setFirstLink(newLink);

	}

	public void display() {
		if (getFirstLink() != null) {
			Link displayLink = getFirstLink();
			while (displayLink.next != null) {
				System.out.println("The values in linkedList are " + displayLink.data);
				displayLink = displayLink.next;
			}
			System.out.println("The values in linkedList are " + displayLink.data);
		}
	}


	public void reverseList(Link firstLink){
		if (firstLink != null) {
			Link newLink = firstLink;
	        while(newLink.next != null){
	        	insertReverseLink(newLink.data);
	        	newLink= newLink.next;
			}
			insertReverseLink(newLink.data);

		}


	}



	private void insertReverseLink(int data) {
		Link newRverLink = new Link(data);
        newRverLink.next = reverseLink;
		reverseLink =  newRverLink;
	}

	public void displayReverse() {
		if (prev != null) {
			Link displayLink = prev;
			while (displayLink.next != null) {
				System.out.println("The values in linkedList are " + displayLink.data);
				displayLink = displayLink.next;
			}
			System.out.println("The values in linkedList are " + displayLink.data);
		}
	}


	public void removeLinks() {
		if (firstLink != null) {
			while (firstLink.next != null) {
				System.out.println(" The values removed are are " + firstLink.next.data);
				firstLink = firstLink.next;
			}
		}
	}

	public Link find(int data) {
		Link theLink = getFirstLink();
		while (theLink != null) {
			if (data == theLink.data) {
				System.out.println("Item " + data + " found");
				return theLink;

			} else {
				theLink = theLink.next;

			}
		}
		System.out.println("Item Not found");
		return null;
	}

	public void removeSpecifiedLink(int data) {
		Link theLink = getFirstLink();
		Link previousLink = null;
		while (theLink != null) {
			if (data == theLink.data) {
				System.out.println("Item " + data + " found");
				previousLink.next = theLink.next;
				break;

			} else {
				previousLink = theLink;
				theLink = theLink.next;

			}
		}
		System.out.println("Item Not found");
	}

	public int getNthNode(int index) {
		int count = 0;
		Link theLink = getFirstLink();

		while (theLink != null) {
			if (count == index) {
				return theLink.data;
			} else
				count = count + 1;
			theLink = theLink.next;
		}

		return 0;
	}

	public int getMiddleNodeElement() {
		int counter = 0;
		Link theLink = getFirstLink();
		while (theLink != null) {
			counter++;
			theLink = theLink.next;
		}

		if (counter > 0) {
			return getNthNode(counter / 2);
		} else {
			return getNthNode(counter);
		}
	}

	public void insertDataInSortedLinkedList(int dataNew) {
		Link theLink = getFirstLink();
		Link newLink = new Link(dataNew);
		Link prevLink = getFirstLink();
		Link currLink = null;
		while (theLink != null) {
			if (theLink.data < dataNew) {
				newLink.next = theLink;
				// prevLink.next = newLink.next;
				setFirstLink(newLink);
				break;
			} else {
				theLink = theLink.next;
			}
		}

	}

	public void removeDuplicates() {
		Link theLink = getFirstLink();
		Link nextLink;
		Link loopLink = getFirstLink();
		;
		while (theLink.next != null) {
			for (int i = 0; i < 4; i++) {

				if (theLink.data == loopLink.next.data) {
					nextLink = theLink.next.next;
					theLink.next = nextLink;
					loopLink = theLink.next;
				} else {
					loopLink = theLink.next;
				}
			}
		}
		theLink = theLink.next;
	}

	public boolean loopInALinkedList(){
		Link theLink = getFirstLink();
		Link slowPointer = theLink.next;
		Link fastPointer = theLink.next.next;

		if(slowPointer.data == fastPointer.data){
			return true;
		}

		while(slowPointer.next != null || fastPointer.next != null){

			if(slowPointer.data == fastPointer.data){
				return true;
			}else {
				if(fastPointer.next != null) {
					slowPointer = slowPointer.next;
					fastPointer = slowPointer.next.next;
				}
			}
		}

		return false;
	}


	
}