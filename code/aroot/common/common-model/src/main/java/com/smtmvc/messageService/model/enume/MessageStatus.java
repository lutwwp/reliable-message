package com.smtmvc.messageService.model.enume;

public enum MessageStatus {
	
	WAITING_CONFIRM("待确认"),
	WAITING_SEND("待发送"),
	WAITING_SENDED("待发送"),
	SENDED("已发送"),
	SEND_FAILURE("失败"),
	SEND_SUCCEED("成功");
	
	String content;
	
	MessageStatus(String content  ) {
		this.content = content;
	}
}
