/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

/**
 *
 * @author G
 */
public class CatalogCommand implements Command { 
    protected Catalog catalog;

    public CatalogCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute()  {
        
    }
}
