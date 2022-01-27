package com.rlaul.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSVFile {
	
	private static final String COMMA_DELIMITER = ",";

	public List<List<String>> parseCsv (File file){
		List<List<String>> records = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader (new FileReader(file));
			String row;
			while((row = br.readLine()) != null) {
				String[] values = row.split(COMMA_DELIMITER);
				records.add(Arrays.asList(values));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return records;
	}
	
	public List<List<String>> readCsv(String filePath) {
		File file  = new File(filePath);
		List<List<String>> records = parseCsv(file);
		return records;
	}

	public static void main(String[] args) {
		String filePath = "test-files/test.csv";
		ReadCSVFile obj = new ReadCSVFile();
		List<List<String>> records = obj.readCsv (filePath);
		printRecords(records);
	
	}

	private static void printRecords(List<List<String>> records) {
		for(List<String> values: records) {
			for(String value:values) {
				System.out.println(value);
			}
			System.out.println();
		}
		
	}

}
