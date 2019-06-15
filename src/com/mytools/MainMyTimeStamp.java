// 2019-05-05 18:07:27
package com.mytools;

public class MainMyTimeStamp {

	private static final String PROJECT_FOLDER = "/home/x/git/exerciciJobsW";
//	private static final String PROJECT_FOLDER = "/home/x/git/exerciciDominiVideos";
//	private static final String PROJECT_FOLDER = "/home/x/git/masterClass/MasterClass";

	
	
	public static void main(String[] args) {
		MyTimeStamp myDateTime = new MyTimeStamp(PROJECT_FOLDER);
		myDateTime.writeDate();
//		myDateTime.removeDate();

		
	}

}
