package io.chanary.core.number;

import io.chanary.core.base.BaseNumeric;

public class TranaryNum extends BaseNumeric implements Comparable<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7425615072196207272L;
	private int tranaryNum;

	public TranaryNum() {
		// TODO Auto-generated constructor stub
	}

	public TranaryNum(int i) {
		// TODO Auto-generated constructor stub
		this.tranaryNum = i;
	}
	public int getTranaryNum() {
		return tranaryNum;
	}

	public void setTranaryNum(int tranaryNum) {
		this.tranaryNum = tranaryNum;
	}

	public void add(int t) {
		// TODO Auto-generated method stub
		tranaryNum = tranaryNum + t;
	}

	public void minus(int t) {
		// TODO Auto-generated method stub
		tranaryNum = tranaryNum - t;
	}

	public void div(int t) {
		// TODO Auto-generated method stub
		tranaryNum = tranaryNum / t;
	}

	public void multi(int t) {
		// TODO Auto-generated method stub
		tranaryNum = tranaryNum * t;

	}

	public void mod(int t) {
		// TODO Auto-generated method stub
		tranaryNum = tranaryNum % t;

	}

	public void neg() {
		// TODO Auto-generated method stub
		tranaryNum = -tranaryNum;

	}

	public void abs() {
		// TODO Auto-generated method stub
		if (tranaryNum < 0) {
			tranaryNum = -tranaryNum;
		}

	}

	public void pow(int t) {
		// TODO Auto-generated method stub
		int temp = tranaryNum;
		for (int i = 0; i < t; i++) {
			tranaryNum = tranaryNum * temp;
		}

	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(tranaryNum+"c");
	}
	
	public TranaryNum convertIntToTranaryNum(int i) {
		// TODO Auto-generated method stub
		return new TranaryNum(i);
	}
}
