package com.servdemo.org.util;

import java.util.ArrayList;
import java.util.List;

public class BoardList {
	
	public  List<String> getBoard()  {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(1, "cbse");
		list.add(2, "icse");
		list.add(3, "igcse");
		list.add(4, "internationalBoard");
		list.add(5, "StateBoards");
		list.add(6, "others");
			
		return list;
		
	}

}
