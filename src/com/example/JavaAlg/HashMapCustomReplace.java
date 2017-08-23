package com.example.JavaAlg;

import java.util.Map.Entry;

public class HashMapCustomReplace<K, V> {
	private Entry<K, V>[] table;
	private int capacity = 4;

	class Entry<K, V> {
		private K key;
		private V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

	}

	public HashMapCustomReplace() {
		this.table = new Entry[capacity];
	}

	public Entry<K, V> put(K newKey, V newValue) {
		if (newKey == null) {
			return null;
		}
		int hashValue = hashCode(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue);

		if (table[hashValue] == null) {
			table[hashValue] = newEntry;
		} else {
			Entry<K, V> current = table[hashValue];
			table[hashValue] = newEntry;
			return current;
		}
		return null;

	}

	public V getValue(K key) {

		if (key == null) {
			return null;
		}
		Entry<K, V> temp = table[hashCode(key)];

		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;

			}
		}
		return null;

	}

	public void display() {

		for (Entry<K, V> et : table) {
			if (et != null && et.key != null && et.value != null) {
				System.out.println(et.key + " value " + et.value + " hashCode " + et.hashCode());
				// et = et.next;
			}
		}
	}

	private int hashCode(K key) {
		int x = key.hashCode() % capacity;
		System.out.println(" HashValue " + x + " for key " + key);
		return x;
	}

	public static void main(String[] args) {
		HashMapCustomReplace hashMapCustom = new HashMapCustomReplace();
		hashMapCustom.put(25, 121);
		hashMapCustom.put(30, 151);
		hashMapCustom.put(33, 15);
		hashMapCustom.put(35, 89);

		hashMapCustom.display();

	}
}
