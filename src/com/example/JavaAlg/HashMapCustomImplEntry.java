package com.example.JavaAlg;

import java.util.Map.Entry;

public class HashMapCustomImplEntry<K, V> implements Entry<K, V> {
	private K key;
	private V value;

	public HashMapCustomImplEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public V setValue(V value) {
		V old = this.value;
		this.value = value;
		return old;
	}

	public static void main(String[] args) {
		HashMapCustomImplEntry<String, Object> entry = new HashMapCustomImplEntry<String, Object>("Hello", 123);

		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println(entry.setValue(124));
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());

	}

}
