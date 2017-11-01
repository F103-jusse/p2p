package com.f103.it.result;

public class Result {
	private static final String success_status = "Success";
	private static final String fail_status = "Fail";
	private String status;
	private Object content;

	public Result(boolean isSuccess){
		if(isSuccess){
			status = success_status;
		}else{
			status = fail_status;
		}
	}
	public String getStatus() {
		return status;
	}
	private void setStatus(String status) {
		this.status = status;
	}
	public Object getContent() {
		return content;
	}
	public Result setContent(Object content) {
		this.content = content;
		return this;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", content=" + content + "]";
	}
	
}
