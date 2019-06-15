// 2019-05-05 18:07:27
package com.mytools;

public class MainMyBackup {

	private static final String PROJECT_FOLDER = "/home/x/git/exerciciJobsW";
//	private static final String PROJECT_FOLDER = "/home/x/git/exerciciDominiVideos";
//	private static final String PROJECT_FOLDER = "/home/x/git/masterClass/MasterClass";


	public static void main(String[] args) {
		MyBackup myBackup = new MyBackup(PROJECT_FOLDER);
		myBackup.backup();
	}

}
