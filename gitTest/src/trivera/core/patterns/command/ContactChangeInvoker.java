package trivera.core.patterns.command;

import java.util.*;


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

// This is our invoker class from the Command Pattern. It keeps track of all the changes
// and executes them and perhaps reverses the action
// it does not have any linkage to the object being changed

	// Create the Invoker

public class ContactChangeInvoker{
		// add variable to hold the commands
		private ArrayList<ICommand> changeCmds = new ArrayList<>();

		public ContactChangeInvoker() {
			System.out.println("Invoker created");
		}

		public int setCommand(ICommand changeCommand) {
			System.out.println("Command added to invoker");
			changeCmds.add(changeCommand);
			return changeCmds.indexOf(changeCommand);

		}

		public void contactChanged(int var) {
			changeCmds.get(var).execute();
		}
		public void contactChangeUndone(int var) {
			changeCmds.get(var).undo();
		}

	}


