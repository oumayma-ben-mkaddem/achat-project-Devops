/*package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.services.IProduitService;
import java.util.Date;  


import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProduitServiceTest {

    @Autowired
    IProduitService ps;

    @Test
    @Order(1)
    public void testRetrieveAllProducts() {
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }
    @Test
    @Order(2)
    public void testAddProduct() {
    	Date d=new Date();
    	Produit p=new Produit("c1","c1",150.25f,d,d,1,1);
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }
    
    @Test
    @Order(3)
    public void testUpdateProduct() {
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }
    @Test
    @Order(4)
    public void testUpdateProduct() {
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }
    
    
    
}
*/