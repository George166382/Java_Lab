/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab5.main;

import java.io.IOException;
import lab5.main.CatalogUtil;

/**
 *
 * @author G
 */
public class Main {

    public static void main(String args[]) throws IOException, InvalidCatalogException {
            Main app = new Main();
            app.testCreateSave();
            app.testLoadView();
    }
    private void testCreateSave() throws IOException  {
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("article1","Me","d:/eu/Orac" );
        var article = new Document("book1", "Me2","d:/eu/Orac" );
        catalog.add(book);
        catalog.add(article);
        CatalogUtil.save(catalog, "d:/eu/Orac/catalog.json");
    }
    private void testLoadView() throws InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("d:/eu/Orac/catalog.json");
        CatalogUtil.view(catalog.findById("article1"));
    }
    
}
