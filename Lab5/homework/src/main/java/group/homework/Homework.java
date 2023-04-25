/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group.homework;

import java.io.IOException;
import static javax.xml.catalog.CatalogManager.catalog;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 *
 * @author G
 */
public class Homework { 

    public static void main(String args[]) throws IOException, InvalidCatalogException {
            Homework app = new Homework();
            app.testCreateSave();
            app.testLoadView();
            app.testReport();
    }
    private void testCreateSave() throws IOException  {
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("article1","Me","d:/eu/Orac/article1.txt" );
        var article = new Document("book1", "Me2","d:/eu/Orac/book1.txt" );
        AddCommand a1 = new AddCommand(catalog,book);
        a1.execute();
        AddCommand a2 = new AddCommand(catalog,article);
        a2.execute();
        SaveCommand s = new SaveCommand(catalog, "d:/eu/Orac/catalog.json");
        s.execute();
    }
    private void testLoadView() throws InvalidCatalogException {
        LoadCommand l = new LoadCommand("d:/eu/Orac/catalog.json");
        Catalog catalog = l.execute();
        ViewCommand v = new ViewCommand(catalog.findById("article1"));
        v.execute();
    }
    private void testReport() throws InvalidCatalogException {
        LoadCommand l = new LoadCommand("d:/eu/Orac/catalog.json");
        Catalog catalog = l.execute();
        ReportCommand r = new ReportCommand(catalog);
        r.execute(); 
    }
}
