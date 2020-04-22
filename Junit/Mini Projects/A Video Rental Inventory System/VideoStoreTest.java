import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoStoreTest {

	private VideoStore videoStore;
	//private Video[] store;
	private String name;
	private Video lastAdded;
	private int storeSize;
	
	@Before
	public void before() {
		videoStore = new VideoStore();
		name = "The XYZ";
		storeSize = 0;
	}

	@Test
	public void testAddVideo() {
		name = "The XYZ";
		videoStore.addVideo(name);
		storeSize = videoStore.getStoreSize();
		lastAdded = videoStore.getLastAdded();		
		assertEquals(1, storeSize);
		assertEquals(name, lastAdded.getName());
		

		name = "The ABC";
		videoStore.addVideo(name);
		storeSize = videoStore.getStoreSize();
		lastAdded = videoStore.getLastAdded();		
		assertEquals(2, storeSize);
		assertEquals(name, lastAdded.getName());	
	}

	@Test
	public void testDoCheckout() {
		videoStore.addVideo(name);
		videoStore.getLastAdded().doCheckout();
		assertTrue(videoStore.getLastAdded().getCheckout());
	}

	@Test
	public void testDoReturn() {
		videoStore.addVideo(name);
		videoStore.getLastAdded().doReturn();
		assertFalse(videoStore.getLastAdded().getCheckout());
	}

	@Test
	public void testReceiveRating() {
		videoStore.addVideo(name);
		videoStore.receiveRating(name, 5);
		lastAdded = videoStore.getLastAdded();
		assertEquals(5, lastAdded.getRating());	
	}

	@Test
	public void testListInventory() {
		try {
			videoStore.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

}
