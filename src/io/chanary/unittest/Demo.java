package io.chanary.unittest;

import io.chanary.core.base.BaseProperties;
import io.chanary.core.number.TranaryNum;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseProperties baseProperties = new BaseProperties();
		
//		ResultType result = baseProperties.saveProperties();
//		System.out.println(result.getResult());
		TranaryNum demo = new TranaryNum();
		demo.setTranaryNum(1);
		demo.add(10);
		System.out.println("Demo TranaryNum: " + demo.getTranaryNum());
		System.out.println("Demo TranaryNum: " + demo.convertIntToTranaryNum(100).toString());
		String popStr = baseProperties.readProperties("config.properties", "version");
		System.out.println("Version " +popStr);
	}

}
