package com.Hash_Map;

import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {
		
		int [] arr = {10,90,80,70,60,50,50};
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int key : arr) {
			if(hmap.containsKey(key)) {
				hmap.put(key, hmap.get(key)+1);
			}
			else {
				hmap.put(key, 1);
			}
		}
		
		System.out.println(hmap);
		
		for(int key : hmap.keySet()) {
			System.out.println(key + " : " + hmap.get(key));
		}
	}

}
