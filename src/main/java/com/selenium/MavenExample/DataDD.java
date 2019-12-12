package com.selenium.MavenExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDD {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Ragavi\\eclipse-workspace\\MavenExample\\excel\\data.xlsx");
		FileInputStream in=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(in);
		Sheet s=w.getSheet("Dat");
		Row r=s.getRow(0);
		Cell c=r.getCell(1);
		System.out.println(c);
		

}
}