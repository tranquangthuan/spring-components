package com.fa.demomvc.api.model;

public class ResponseResult {
	private String status;
	private Object data;
	private int httpStatus;

	public ResponseResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseResult(String status, Object data, int httpStatus) {
		super();
		this.status = status;
		this.data = data;
		this.httpStatus = httpStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

}
