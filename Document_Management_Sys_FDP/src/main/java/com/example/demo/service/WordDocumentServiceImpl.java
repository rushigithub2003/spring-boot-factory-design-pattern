package com.example.demo.service;

public class WordDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read Data From DB");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For Word");
	}

	@Override
	public String printData() {
		// TODO Aut-generated method stub
		System.out.println("Print Word");
		return "Word";
	}

}
