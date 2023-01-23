package Practice_Maven;

import org.testng.annotations.Test;

public class DeleteTest {
	@Test(groups="smoke")
	public void delete() {
		System.out.println("Deleted");
	}
	@Test
	public void deleted() {
		System.out.println("Successfully deleted");
	}

}
