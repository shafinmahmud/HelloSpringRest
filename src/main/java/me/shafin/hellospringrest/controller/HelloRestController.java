package me.shafin.hellospringrest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.shafin.hellospringrest.test.Message;

@RestController
public class HelloRestController {

	 @RequestMapping("/{player}")
	public Message message(@PathVariable String player) { 
	        Message msg = new Message(player, "Hello " + player);
	        return msg;
	    }
}
