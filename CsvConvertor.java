package com.JavaAllAtOnce.IOStreams;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

public class CsvConvertor {
	
	public static void main(String args[]) throws IOException {
		
		List<String> lines= Files.readAllLines(Paths.get("C:\\Users\\sr73\\eclipse-workspace\\AtFirst\\src\\com\\JavaAllAtOnce\\IOStreams\\organizations-100.csv"));
		
		BufferedWriter writer=Files.newBufferedWriter(Paths.get("C:\\Users\\sr73\\eclipse-workspace\\AtFirst\\src\\com\\JavaAllAtOnce\\IOStreams\\organizations-new-100.csv"));
		
		lines.forEach(line->{
			
			StringJoiner stringJoiner=new StringJoiner(",");
			
			String lines01[]=line.split(";");
			
			for(String line01:lines01) {
				
				stringJoiner.add(line01);
				
			}
			
			try {
				writer.append(stringJoiner.toString()+"\n");
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
	}

}
