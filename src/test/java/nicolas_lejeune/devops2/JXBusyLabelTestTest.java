package nicolas_lejeune.devops2;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class JXBusyLabelTestTest extends TestCase {
	
	JXBusyLabelTest app;
	
	@Before
	protected void setUp() throws Exception {
		app = new JXBusyLabelTest();
	}

	@After
	protected void tearDown() throws Exception {
		app = null;
	}
	
	@Test
	public void testStartButton() {
		app.btnStart.doClick();;
		assertEquals(true, app.bLabel1.isBusy());
	}
	
	@Test
	public void testStopButton() {
		app.btnStop.doClick();;
		assertEquals(false, app.bLabel1.isBusy());
	}

}
