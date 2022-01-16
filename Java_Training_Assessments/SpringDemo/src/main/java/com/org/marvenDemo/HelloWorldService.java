package com.org.marvenDemo;

public class HelloWorldService {

		private String name;
		private String Address;
		
		public void setName(String name) {
			this.name = name;
		}
	
		public void setAddress(String address) {
			Address = address;
		}
		
		public String InfoData() {
			return "Hello "+name+" Your are Staying "+ Address;
		}
}
