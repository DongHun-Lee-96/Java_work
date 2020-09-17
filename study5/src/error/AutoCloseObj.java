package error;

public class AutoCloseObj implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("close() is called");
	}

}
