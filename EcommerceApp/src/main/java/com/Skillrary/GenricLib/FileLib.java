package com.Skillrary.GenricLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readPropertyData(String propPath, String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key,"Incorrect Kety");
	}
	
	public void readExcelData(String excelPath, String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public void writeExcelData(String excelPath, String sheet, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}

}
