package test.one.bank;

import java.util.HashMap;

public class HashStorage {

	HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
	
	public void put(Integer transNum, Double amount) {
		hashMap.put(transNum, amount);
	}
		
		public Double getTransaction(Integer transNum) {
		return hashMap.get(transNum);
	}

}