/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

/**
 *
 * @author G
 */
public class AddCommand extends CatalogCommand{
    private Document doc; 

    /**
     *
     * @param catalog
     * @param arguments
     */
    public AddCommand(Catalog catalog,  Document doc) {
        super(catalog);
        this.doc = doc;
    }

    @Override
    public void execute() {
        
        catalog.add(doc);
    }
    
}
