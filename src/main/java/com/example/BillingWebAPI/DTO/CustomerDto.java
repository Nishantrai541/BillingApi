package com.example.BillingWebAPI.DTO;


public class CustomerDto {

		
	    private long customer_Id;
		
		private String customer_Name;
		
		
		private long customer_Mobile;
		
		
		private String Customer_Email;
		
		private String customer_Address;
		
		private int customer_pin;

		public CustomerDto(long customer_Id, String customer_Name, long customer_Mobile, String customer_Email,
				String customer_Address, int customer_pin) {
			super();
			this.customer_Id = customer_Id;
			this.customer_Name = customer_Name;
			this.customer_Mobile = customer_Mobile;
			Customer_Email = customer_Email;
			this.customer_Address = customer_Address;
			this.customer_pin = customer_pin;
		}

		public CustomerDto() {
			super();
		}

		public long getCustomer_Id() {
			return customer_Id;
		}

		public void setCustomer_Id(long customer_Id) {
			this.customer_Id = customer_Id;
		}

		public String getCustomer_Name() {
			return customer_Name;
		}

		public void setCustomer_Name(String customer_Name) {
			this.customer_Name = customer_Name;
		}

		public long getCustomer_Mobile() {
			return customer_Mobile;
		}

		public void setCustomer_Mobile(long customer_Mobile) {
			this.customer_Mobile = customer_Mobile;
		}

		public String getCustomer_Email() {
			return Customer_Email;
		}

		public void setCustomer_Email(String customer_Email) {
			Customer_Email = customer_Email;
		}

		public String getCustomer_Address() {
			return customer_Address;
		}

		public void setCustomer_Address(String customer_Address) {
			this.customer_Address = customer_Address;
		}

		public int getCustomer_pin() {
			return customer_pin;
		}

		public void setCustomer_pin(int customer_pin) {
			this.customer_pin = customer_pin;
		}

		
		
}
