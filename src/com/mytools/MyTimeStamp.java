// 2019-05-05 18:07:27
package com.mytools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTimeStamp {
	private String projectPath;

	public MyTimeStamp() {
		projectPath = System.getProperty("user.dir");
	}

	public MyTimeStamp(String projectPath) {
		this.projectPath = projectPath;
	}

	public final String getProjectPath() {
		return projectPath;
	}

	public final void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	public List<String> getFileList() {
		List<String> fileList = new ArrayList<>();
		try (Stream<Path> walk = Files.walk(Paths.get(getProjectPath()))) {
			fileList = walk.map(x -> x.toString())
					.filter(f -> f.endsWith(".java"))
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileList;
	}



//	public void writeDate() {
//		String dateHeader = getDateHeader();
//		List<String> fileList = getFileList();
//		for (String filePathStr : fileList) {
//			String newFileStr = dateHeader;
//			File currentFile = new File(filePathStr);
//
//			try (Scanner scanner = new Scanner(currentFile)) {
//				String firstLine = scanner.nextLine();
//				if (firstLine.length() != 22
//						&& !firstLine.substring(0, 2).equals("//")) {
//					newFileStr += firstLine + "\n";
//				}
//				while (scanner.hasNextLine()) {
//					newFileStr += scanner.nextLine() + "\n";
//				}
//				scanner.close();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//					new FileOutputStream(filePathStr), "utf-8"))) {
//				writer.write(newFileStr);
//				writer.close();
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			System.out.println("ok processing: " + filePathStr);
//		}
//	}

	public void writeDate() {
		String dateHeader = getDateHeader();
		List<String> fileList = getFileList();
		for (String filePathStr : fileList) {
			String newFileStr = dateHeader;
			File currentFile = new File(filePathStr);

			try (Scanner scanner = new Scanner(currentFile)) {
				String firstLine = scanner.nextLine();
				if (firstLine.length() > 6
						&& !firstLine.substring(0, 7).equals("// 2019")) {
					newFileStr += firstLine + "\n";
				}
				while (scanner.hasNextLine()) {
					newFileStr += scanner.nextLine() + "\n";
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(filePathStr), "utf-8"))) {
				writer.write(newFileStr);
				writer.close();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("ok processing: " + filePathStr);
		}
	}

	public void removeDate() {
		List<String> fileList = getFileList();
		for (String filePathStr : fileList) {
			String newFileStr = "";
			File currentFile = new File(filePathStr);

			try (Scanner scanner = new Scanner(currentFile)) {
				String firstLine = scanner.nextLine();
				if (firstLine.length() < 6
						&& !firstLine.substring(0, 7).equals("// 2019")) {
					newFileStr += firstLine + "\n";
				}
				while (scanner.hasNextLine()) {
					newFileStr += scanner.nextLine() + "\n";
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(filePathStr), "utf-8"))) {
				writer.write(newFileStr);
				writer.close();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("ok processing: " + filePathStr);
		}
	}
	
	public static String getDateHeader() {
		return "// "
				+ LocalDateTime.now().format(
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
				+ "\n";
	}
}
