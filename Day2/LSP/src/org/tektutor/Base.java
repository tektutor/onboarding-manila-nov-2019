package org.tektutor;

import java.io.FileNotFoundException;

public abstract class Base {
	
	protected abstract void openFile ( String fileName ) throws FileNotFoundException;
	public abstract void closeFile( );

}
