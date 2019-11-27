package org.tektutor;

import java.io.File;

public class Child1 extends Base {

	public void openFile(String fileName)  {

		try {
			File file = new File("somefilewhichdoesnotexist");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeFile() {
		
	}

}
