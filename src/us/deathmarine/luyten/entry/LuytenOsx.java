package us.deathmarine.luyten.entry;

import com.apple.eawt.Application;

/**
 * An OS X-specific initialization method for dragging/dropping
 */
public class LuytenOsx extends Luyten {
	public static void main(String[] args) {
		// Add an adapter as the handler to a new instance of the application
		// class
		@SuppressWarnings("deprecation")
		Application app = new Application();
		app.setOpenFileHandler(e -> {
            Luyten.addToPendingFiles(e.getFiles().get(0));
            Luyten.processPendingFiles();
        });
		app.setQuitHandler((e, response) -> Luyten.quitInstance());

		// Call the superclass's main function
		Luyten.main(args);
	}
}
