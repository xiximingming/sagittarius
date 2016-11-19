package trivera.core.patterns.command;


/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright © 2015 Trivera Technologies LLC., Worldwide
 * http://www.triveratech.com   
 * </p>
 * @author Trivera Technologies Tech Team.
 */

// This class is the receiver of the action we are wanting to capture to
// manage the process of changing data

	// Create the Receiver Class
	//Contact.java
public class Contact{

		private String name;
		private String address;
		private String city;
		private String state;
		private String phone;

		public Contact(){
			name = "unknown";
			address = "unknown";
			city="unknown";
			state="unknown";
			phone="unknown";
		}

		public String getName() { return name; }

		public String setName(String name) {
			this.name = name;
			return this.name;
		}

		public String getAddress() { return address; }

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() { return city; }

		public void setCity(String city) {
			this.city = city;
		}
		public String getState() { return state; }

		public void setState(String state) {
			this.state = state;
		}
		public String getPhone() { return phone; }

		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String toString() {
			return "Name: "+name+"\nAddress: "+address + ", " + city + " " + state +
			"\nPhone: "+ phone;
		}

	}

