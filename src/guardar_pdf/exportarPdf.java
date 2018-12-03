/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardar_pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class exportarPdf {

    public void exportarPdf(JTable t) throws IOException {

        Document documento = new Document();
        FileOutputStream ficheroPdf;
        try {
            ficheroPdf = new FileOutputStream("C:\\Users\\Usuario\\Documents\\diego simula1.PDF");
            PdfWriter.getInstance(
                    documento,
                    ficheroPdf
            ).setInitialLeading(20);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        try {
            documento.open();
            documento.add(new Paragraph("nuestro texto"));
            Paragraph parrafo2 = new Paragraph("nuestro segundo Texto");
            parrafo2.setAlignment(1);//el 1 es para centrar
            documento.add(parrafo2);
            documento.add(new Paragraph(" "));
            PdfPTable tabla = new PdfPTable(3);
            //el numero indica la cantidad de Columnas
            tabla.addCell("celda1");
            tabla.addCell("celda2");
            tabla.addCell("celda3");
            tabla.addCell("celda4");
            tabla.addCell("celda5");
            tabla.addCell("celda6");
            // de aqui en adelante es para añadir un nuevo parrafo 
            documento.add(tabla);
            documento.add(new Paragraph(" "));
            PdfPTable tabla2 = new PdfPTable(3);
            PdfPCell celda = new PdfPCell(
                    new Paragraph("celda \nmodificada")
            );
            celda.setColspan(2);
            //cantidad de columnas que ocupa esta celda
            celda.setRowspan(2);
            //cantidad de filas que ocupa esta celda
            tabla2.addCell(celda);

            documento.add(tabla2);
            documento.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
