package de.isys.jawap.util;

public class GraphiteEncoder {
	public static String encodeForGraphite(String s) {
		return s.replace(".", ":").replace(" ", "_").replace("/", "|");
	}

	public static String decodeForGraphite(String s) {
		return s.replace(":", ".").replace("_", " ").replace("|", "/");
	}
}
