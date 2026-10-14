package com.example.demo.service;

public class ExcelDocumentServiceImpl implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data from DB");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data for excel");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print Excel");
		return "Excel";
	}

}
