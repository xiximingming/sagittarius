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


//Check list
//
//   1. Define a Command interface with a method signature like execute().
//   2. Create one or more derived classes that encapsulate some subset of the following: a “receiver” object, the method to invoke, the arguments to pass.
//   3. Instantiate a Command object for each deferred execution request.
//   4. Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
//   5. The invoker decides when to execute().



// This class is our client that is making the change to the Contacts

public class TestCommandPattern {
	public static void main(String args[]){
		Contact joeContact = new Contact();
		joeContact.setName("Joe Contact");
		joeContact.setAddress("123 Cherry Tree Lane");
		joeContact.setCity("Palooka Village");
		joeContact.setPhone("(123) 123-1234");


		System.out.println("Our contact before making the change: ");
		System.out.println(joeContact.toString());

		System.out.println("Create the invoker to store the commands.");
		ContactChangeInvoker invoker = new ContactChangeInvoker();

		ICommand change = new ChangeCommand(joeContact, "Address", "922 Wolfbane Road");
		System.out.println("Add the change command to the invoker and capture the index location.");

		int i = invoker.setCommand(change);


		System.out.println("");
		System.out.println("Executing our contact change.");
		System.out.println("");
		invoker.contactChanged(i);


		System.out.println("");
		System.out.println("Our contact after the change. ");
		System.out.println("");
		System.out.println(joeContact.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("Having a change of heart on the change.");
		System.out.println("");
		invoker.contactChangeUndone(i);
		System.out.println("");
		System.out.println("Our contact after the change of heart. ");
		System.out.println("");
		System.out.println(joeContact.toString());
		}
	}


