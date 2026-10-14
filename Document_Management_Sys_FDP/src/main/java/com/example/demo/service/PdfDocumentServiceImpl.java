package com.example.demo.service;

public class PdfDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data From DB");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for PDF");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print PDF");
		return "PDF";
	}

}
