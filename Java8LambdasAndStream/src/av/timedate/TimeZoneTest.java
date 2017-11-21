package av.timedate;

import java.time.ZoneId;

public class TimeZoneTest {

	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds()
				.stream()
				.filter((z) -> z.contains("IN") || z.contains("India"))
				.forEach(System.out :: println);

	}

}
