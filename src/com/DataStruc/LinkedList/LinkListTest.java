package com.DataStruc.LinkedList;

public class LinkListTest {

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		//ll.insertLink(3);
		ll.insertLink(4);
		ll.insertLink(3);
		ll.insertLink(2);
		ll.insertLink(1);
		ll.insertLink(9);
		ll.display();
        System.out.println(ll.loopInALinkedList());
		LinkList l2 = new LinkList();
		l2.insertLink(1);
		l2.insertLink(2);
		l2.display();
		listCompare(ll, l2);

		System.out.println("Watchout");

		ll.display();
		// ll.insertDataInSortedLinkedList(3);
		// ll.find(14);
		// ll.removeSpecifiedLink(2);
		// System.out.println(ll.getNthNode(4));
		// System.out.println(ll.getMiddleNodeElement());
		// ll.removeDuplicates();
		// ll.display();
		// ll.removeLinks();
	}

	private static void listCompare(LinkList ll, LinkList l2) {
		Link list1 = ll.getFirstLink();
		Link list2 = l2.getFirstLink();
		while (list1 != null) {

			while (list2 != null) {
				if (list1.data == list2.data) {
					System.out.println("present");
				} else {
					list2 = list2.next;
				}
			}
			list1 = list1.next;
		}

		return;
	}

}
