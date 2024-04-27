package com.EducationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EducationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationSystemApplication.class, args);
		String reverse ="manenilam";
		char[] arr = reverse.toCharArray();
		String reverse1= "";
		Map<Character, Integer> coutchar = new HashMap<>();
		for(int reversestring = arr.length-1; reversestring >=0; reversestring--) {
			reverse1 += arr[reversestring];
			int count = 0;
			Set<Entry<Character, Integer>> s = coutchar.entrySet(); 
			for(Entry<Character, Integer> charcount : s) {
				
			}
			if(s.contains(coutchar)) 
				coutchar.put(arr[reversestring], count++);
			
		}
		System.out.println(coutchar);
		System.out.println(reverse1);
		
		
		
	}

}
