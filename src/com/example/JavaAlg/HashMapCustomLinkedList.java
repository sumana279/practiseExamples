package com.example.JavaAlg;

import java.util.Arrays;
import java.util.Map.Entry;

public class HashMapCustomLinkedList<K, V> {
	private Entry<K, V>[] table;
	private int capacity = 150;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

	}

	public HashMapCustomLinkedList() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V newValue) {
		if (newKey == null) {
			return;
		}
		int hashValue = hashCode(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue, null);

		if (table[hashValue] == null) {
			table[hashValue] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hashValue];
			newEntry.next = current;
			current = newEntry;
			table[hashValue] = current;
			return;
		}

	}

	public V getValue(K key) {

		if (key == null) {
			return null;
		}
		Entry<K, V> temp = table[hashCode(key)];

		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			} else {
				temp = temp.next;
			}
		}

		return null;

	}

	private int hashCode(K key) {
		int x = key.hashCode() % capacity + 7;
		System.out.println(" HashValue " + x + " for key " + key);
		return x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + Arrays.hashCode(table);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		HashMapCustomLinkedList other = (HashMapCustomLinkedList) obj;
		if (capacity != other.capacity)
			return false;
		if (!Arrays.equals(table, other.table))
			return false;
		return true;
	}

	public void display() {

		for (Entry<K, V> et : table) {
			while (et != null) {
				System.out.println(et.key + " value " + et.value + " hashCode " + et.hashCode());
				et = et.next;
			}

		}
	}

	public static void main(String[] args) {

		HashMapCustomLinkedList<Integer, Integer> hashMapCustom = new HashMapCustomLinkedList();
		hashMapCustom.put(25, 121);
		hashMapCustom.put(30, 151);
		hashMapCustom.put(33, 15);
		hashMapCustom.put(35, 89);

		// System.out.println("value corresponding to key 30=" +
		// hashMapCustom.getValue(30));
		// System.out.println("value corresponding to key 33=" +
		// hashMapCustom.getValue(33));

		System.out.println("Displaying : ");
		hashMapCustom.display();

	}

}