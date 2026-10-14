package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentServiceImpl;
import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocumentServiceImpl;

public class Factory {

	public static DocumentService createObject(String type) {
		
		if (type.equals("pdf")) {
			return new PdfDocumentServiceImpl();
		}

		if (type.equals("excel")) {
			return new ExcelDocumentServiceImpl();
		}
		
		if (type.equals("word")) {
			return new WordDocumentServiceImpl();
		}
		return null;
	}

}
