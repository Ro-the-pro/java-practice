package com.rlaul.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CsvFileHandler {

	private static final String COMMA_DELIMITER = ",";
	
	public static void main(String[] args) {
		String filePath = "test-files/test.csv";
		CsvFileHandler obj = new CsvFileHandler();
		
		//List<List<String>> records = null;
		//records = obj.parseCsv(filePath);
		//obj.printRecords(records);
		
		List<String[]> records = null;
		records = obj.parseCsvUsingOpenCsv(filePath);
		obj.printArrayRecords(records);
	}


	public List<List<String>> parseCsv(String filepath) {
		List<List<String>> records = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
			String row;
			while ((row = br.readLine()) != null) {
				String[] values = row.split(COMMA_DELIMITER);
				records.add(Arrays.asList(values));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return records;
	}
	
	public List<String[]> parseCsvUsingOpenCsv(String filepath){
		List<String[]> values = null;
		try(CSVReader reader = new CSVReader(new FileReader(filepath))){
			try {
				values = reader.readAll();
				values.forEach(x-> Arrays.toString(x));
				
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return values;
	}


	private void printRecords(List<List<String>> records) {
		for (List<String> values : records) {
			for (String value : values) {
				System.out.print(value+"\t");
			}
			System.out.println();
		}
	}
	

	private void printArrayRecords(List<String[]> records) {
		for(String[] valuesArr: records) {
			for(int i=0;i<valuesArr.length;i++) {
				System.out.print(valuesArr[i]+"\t");
			}
			System.out.println();
		}
	}
}
