package com.explain;

public class TOYOTA extends Vehicle {

	@Override
	public void specification() {

		System.out.println("TOYOTA specification method");
	}

	public void toyotaOwnMilege() {
		System.out.println("TOYOTA car 20 milege");
	}

	public static void main(String[] args) {
		Vehicle vt = new TOYOTA();
		vt.tyre();
		vt.specification();
		//vt.toyotaOwnMilege(); // loose coupling

		TOYOTA toyota = new TOYOTA();
		toyota.tyre();
		toyota.specification();
		toyota.toyotaOwnMilege(); // tight coupling

	}

}
