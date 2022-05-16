package com.vivek.maven.springCore.InnerBeans;

public class Address {

	 private int membershipId;
		private String membershipType;
		private int visitePerYear ;
		 
		
		@Override
		public String toString() {
			return "Address [membershipId=" + membershipId + ", membershipType=" + membershipType + ", visitePerYear="
					+ visitePerYear + "]";
		}

	
}
