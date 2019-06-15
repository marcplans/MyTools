// 2019-05-05 18:07:27
package com.mytools;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;

public class MyBackup {
	private static final String BACKUP_FOLDER = "/home/x/myBackupJava/";
	private File originPath;

	public MyBackup() {
		if ((new File(System.getProperty("user.dir")).getParentFile().getName())
				.equals("workspaceJava")) {
			originPath = new File(System.getProperty("user.dir"));
		} else {
			originPath = new File(System.getProperty("user.dir"))
					.getParentFile();
		}
	}

	public MyBackup(String originPath) {
		this.originPath = new File(originPath);
	}

	public final File getOriginPath() {
		return originPath;
	}

	public final void setOriginPath(File originPath) {
		this.originPath = originPath;
	}

	public void backup() {
		String backupPathStr = BACKUP_FOLDER
				+ LocalDateTime.now()
						.format(DateTimeFormatter.ofPattern("yyMMddHHmmss"))
				+ "_" + getOriginPath().getName();
		try {
			FileUtils.copyDirectory(getOriginPath(), new File(backupPathStr));
			System.out.println("Project successfully copied!");
		} catch (IOException e) {
			System.out.println("\nError copying files!\n"
					+ e.getClass().toString().substring(6) + "\n"
					+ e.getLocalizedMessage() + "\n");
		}
	}
	
}
