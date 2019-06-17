package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.app.repo.ProductRepsitory;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepsitory repo;


	@Override
	public void run(String... args) throws Exception {

		int count=repo.removeData(3);	
		System.out.println(count);
	}


}
