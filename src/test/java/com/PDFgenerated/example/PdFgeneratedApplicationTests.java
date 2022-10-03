package com.PDFgenerated.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.PDFgenerated.example.PDF.PDFgenerated;
import com.PDFgenerated.example.PDF.ReadExcel;

@SpringBootTest
class PdFgeneratedApplicationTests {

	@Test
	void contextLoads() {
	

	PDFgenerated pdf=new PDFgenerated();
	//pdf.writeUsingIText();
	ReadExcel readExcel = new ReadExcel();
	readExcel.ReadExcelFile();
		

}
}