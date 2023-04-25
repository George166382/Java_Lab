/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

import java.util.List;

/**
 *
 * @author G
 */
public class ListCommand implements Command {

        private Catalog catalog; 

        ListCommand(Catalog catalog) {
            this.catalog = catalog;
        }

        @Override
        public void execute(){
            List<Document> documentIds = catalog.getDocs();

            if (documentIds.isEmpty()) {
                System.out.println("No documents in catalog");
            } else {
                System.out.println("Documents in catalog:");

                for (Document documentId : documentIds) {
                    System.out.println(documentId);
                }
            }
        }
}
