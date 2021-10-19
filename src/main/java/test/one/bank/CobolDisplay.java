package test.one.bank;

public class CobolDisplay {

	CobolDisplay cobolDisplay = new DisplayFactory.getInstance().getDisplay();
	
	public void display(Double amount) {
		cobolDisplay.display(amount);
		
	}

	public void display(Integer transId) {
		cobolDisplay.display(transId);
		
	}
	
	
}
