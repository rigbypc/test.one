package test.one.bank;

public class TransactionProcessor {

	private CobolDisplay cobol;
	private HashStorage hash;
	Double fee = 1.0;
	
	public TransactionProcessor() {
		cobol = new CobolDisplay();
		hash = new HashStorage();
		fee = 5.365;
	}
	
	public void transaction(Integer transNum, Double amount) {
		cobol.display(transNum);
		cobol.display(amount);
		
		amount *= fee;
		
		cobol.display(amount);
		hash.put(transNum, amount);
	}

}
