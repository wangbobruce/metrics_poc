package com.bwang.metrics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class SourceCodeReader {

	private BufferedWriter writer;
	@Test
	public void testMergeFiles() throws Exception{
		//String folderName = "C:/work/study/prometheus-1.0.1";
		String folderName = "E:/Study/bigData/prometheus-1.0.1";
		writer = new BufferedWriter(new FileWriter(new File("E:/Study/bigData/prometheus-1.0.1_all.go")));
				
		handleOneFolder(new File(folderName));
		
		writer.close();
	}
	
	
	private void handleOneFolder(File folder) throws Exception {
		File[] files = folder.listFiles();
		for(File f : files) {
			if (f.isDirectory()) {
				handleOneFolder(f);
			} else {
				handleOneFile(f);
			}
		}
	}
	
	private void handleOneFile(File f) throws Exception{
		if(f.getName().endsWith(".go") && !f.getName().contains("_test.go")) {
//		if(f.getName().endsWith(".java") && !f.getName().contains("Test.java")) {
		  BufferedReader reader = new BufferedReader(new FileReader(f));
		  String s = null;
		  writer.append("// -- " + f.getPath()).append("\n");
		  
		  boolean begin = true;
		  
		  int index = 0;
		  while ((s = reader.readLine())!= null) {
			  index ++;
			  if(begin && s.startsWith("//")) {
				  continue;
			  }
			  begin = false;
			  String temp = String.format("%4d %s\n", index, s);
			  writer.append(temp);
		  }
		}
	}
	
	
}
