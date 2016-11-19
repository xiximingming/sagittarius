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


//Create the ConcreteCommand Classes that implements the changes we want
// to capture - and so we can control when they happen and perhaps undo them
// this class wraps the object being changed and manages what gets changed
// and when.



	//ChangeCommand.java
public class ChangeCommand implements ICommand {

		private Contact cmdContact;
		private String newData;
		private String oldData;
		private String field;

		public ChangeCommand(Contact contact, String field, String newData) {
			cmdContact = contact;
			this.newData = newData;
			this.field = field;
		}

		public void execute() {
			if (field =="Name"){
				oldData = cmdContact.getName();
			    cmdContact.setName(newData);
			}else if(field=="Address"){
				oldData = cmdContact.getAddress();
			    cmdContact.setAddress(newData);
			}else if(field=="City"){
				oldData = cmdContact.getCity();
			    cmdContact.setCity(newData);
			}else if(field=="State"){
				oldData = cmdContact.getState();
			    cmdContact.setState(newData);
			}else if(field=="Phone"){
				oldData = cmdContact.getPhone();
			    cmdContact.setPhone(newData);
			}else {
				oldData = "unknown";
			}
		}

		public void undo(){
			if (field =="Name"){
			    cmdContact.setName(oldData);
			}else if(field=="Address"){
			    cmdContact.setAddress(oldData);
			}else if(field=="City"){
			    cmdContact.setCity(oldData);
			}else if(field=="State"){
			    cmdContact.setState(oldData);
			}else if(field=="Phone"){
			    cmdContact.setPhone(oldData);
			}
		}
	}

