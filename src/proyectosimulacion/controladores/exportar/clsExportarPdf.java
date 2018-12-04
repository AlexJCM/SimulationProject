/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimulacion.controladores.exportar;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class clsExportarPdf {

    /**
     * Metodo que recibe una tabla para exportarla y guardarla como tipo
     * Excel..........
     *
     * @param tabla
     * @throws IOException
     */
    public void exportarPdf(JTable t) throws IOException {
        try {

            // Creamos el documento e indicamos el nombre del fichero.
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Usuario\\Documents\\diego simula1.PDF"));
            } catch (FileNotFoundException fileNotFoundException) {

            }
            document.open();

            // (Primera pagina)
            Anchor anchor = new Anchor();
            anchor.setName("");

            //  (El segundo parámetro es el número del capí­tulo).
            Chapter catPart = new Chapter(new Paragraph(anchor), 1);

            Paragraph subPara = new Paragraph("");
            Section subCatPart = catPart.addSection(subPara);
            subCatPart.add(new Paragraph(""));

            // (Creamos la tabla)
            PdfPTable table = new PdfPTable(t.getColumnCount());

            //  (Ahora llenamos las filas de PdfPTable)
            PdfPCell columnHeader;

            // Rellenamos las cabeceras de las columnas de la tabla.                
            for (int column = 0; column < t.getColumnCount(); column++) {
                columnHeader = new PdfPCell(new Phrase(t.getColumnName(column)));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(columnHeader);
            }
            table.setHeaderRows(1);
            // (rellenamos las filas de la tabla).                
            for (int row = 0; row < t.getRowCount(); row++) {
                for (int column = 0; column < t.getColumnCount(); column++) {
                    table.addCell(t.getValueAt(row, column).toString());
                }
            }
            subCatPart.add(table);

            document.add(catPart);

            document.close();
            try {
                File path = new File("C:\\Users\\Usuario\\Documents\\diego simula1.PDF");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }

    }
}
