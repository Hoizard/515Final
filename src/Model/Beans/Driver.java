package Model.Beans;

import java.util.List;

public class Driver extends User{

	private Car car;
	private float receipt;
	private List<Transaction> transactionList;
	

	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	public float getReceipt() {
		return receipt;
	}
	public void setReceipt(float receipt) {
		this.receipt = receipt;
	}
	
	
}
