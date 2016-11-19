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


// this is the interface that identifies the various methods to capture

//Create the Command interface.
//Command.java
public interface ICommand {
	 public void execute();
	 public void undo();

}

