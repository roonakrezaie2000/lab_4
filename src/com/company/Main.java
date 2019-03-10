package com.company;

import com.itextpdf.text.pdf.PdfReader;
public class Main{
    public static void main(String[] args){
        try {
            PdfReader pdfReader = new PdfReader("C:\\Users\\MyPc\\IdeaProjects\\session4\\src\\com\\company\\Final_Project.pdf");
            int p = pdfReader.getNumberOfPages();
            System.out.println(p);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
