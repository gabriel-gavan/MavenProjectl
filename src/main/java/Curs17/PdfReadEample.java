package Curs17;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReadEample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("sample.pdf");
		PDDocument document = PDDocument.load(file);
		
		PDFTextStripper pdfstripper = new  PDFTextStripper();
		String text = pdfstripper.getText(document);
		System.out.println(text);
		document.close();
		System.out.println(readLineFromPDF("Sample.pdf","This","demonstration"));
	}

	public static String readLineFromPDF(String path, String inceput, String finish) throws IOException {
		String returnedString = "";
		PDDocument document = PDDocument.load(new File (path));
		PDFTextStripper pdfstripper = new PDFTextStripper();
		String allPdfText = pdfstripper.getText(document);
		String strStart = inceput;
		String strFinish = finish;
		int startIndex = allPdfText.indexOf(strStart);
		int endIndex = allPdfText.indexOf(strFinish);
		returnedString = allPdfText.substring(startIndex,endIndex) + strFinish;
		
		return returnedString;
	}
}
