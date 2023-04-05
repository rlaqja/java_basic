package com.spring.multi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapControlloer {

	@RequestMapping("jasonResponse5")
	@ResponseBody
	public MapVO kakaoMap() {
		MapVO bag = new MapVO();
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		System.out.println(bag);
		
		return bag;
	}
}
