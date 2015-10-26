import java.util.List;

import org.junit.Test;

import cc.aaron67.ytst.main.SpeedTest;
import cc.aaron67.ytst.model.ServerRecord;

public class UnitTest {

	@Test
	public void fetchTest() {
		SpeedTest st = new SpeedTest();
		st.fetchServerList();
		List<ServerRecord> serverList = st.getServerList();
		for (ServerRecord sr : serverList) {
			System.out.println(sr.getRegion() + " " + sr.getName() + " " + sr.getDomain() + " " + sr.getStatus() + " "
					+ sr.getProtocal() + " " + sr.getComment());
		}
	}
}