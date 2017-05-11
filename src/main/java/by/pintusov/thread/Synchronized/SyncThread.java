package by.pintusov.thread.Synchronized;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class SyncThread extends Thread {
	private Resource resource;

	public SyncThread (String name, Resource resource) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			resource.writing(getName(), i); //place synchronizing
		}
	}
}
