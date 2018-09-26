package com.example.srpingBoot.xmlMessageConverter;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgUserController {

	@PostMapping(value="/msgUser",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public MsgUser create(@RequestBody MsgUser msgUser){
		msgUser.setName("didispace.com : " + msgUser.getName());
		msgUser.setAge(msgUser.getAge() + 100);
        return msgUser;
	}
}
