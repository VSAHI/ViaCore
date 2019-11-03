package io.chanary.core.type;

import io.chanary.core.base.BaseResultType;

public class ResultType extends BaseResultType {
	
	private String result;
	private String key;

	public ResultType(String key, String resultType) {
		// Constructor
		this.key = key;
		this.result = resultType;
	}
	
	public ResultType( String resultType) {
		// Constructor
		this.result = resultType;
	}	

	@Override
	public String getResult() {
		return result;
	}

	@Override
	public void setResult(String resultType) {
		this.result = resultType;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(String key) {
		// TODO Auto-generated method stub
		this.key = key;
	}
	

}
