package com.app.vivek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ReadDataRunner implements CommandLineRunner{
	@Autowired
	private MyServiceData ob;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ob);
		
	}
}
