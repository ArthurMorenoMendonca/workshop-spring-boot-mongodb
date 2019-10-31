package com.morenoweb.mongodb.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {
	
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		}catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static Date convertDate(String txtDate, Date defaultValue) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		sd.setTimeZone(TimeZone.getTimeZone("GMT"));
		return defaultValue;
	}

}
