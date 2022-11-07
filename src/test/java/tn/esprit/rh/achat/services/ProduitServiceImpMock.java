package tn.esprit.rh.achat.services;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Test;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.services.IProduitService;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import org.junit.runner.RunWith;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProduitServiceImpMock {
	@InjectMocks
	ProduitServiceImpl  produitService ;

	    @Mock
	    ProduitRepository produitRepository ;

	    @Test
	    public void testGetallProducts(){
	        when(produitRepository. findAll()).thenReturn(Stream
	                .of(new Produit(), new Produit()).collect(Collectors.toList()));
	        assertEquals(2, produitService.retrieveAllProduits().size());
	    }

	    @Test
	    public void TestAddProduct(){
	        Produit prod = new Produit();
	        when(produitRepository.save(prod)).thenReturn(prod);
	        assertEquals(prod, produitService.addProduit(prod));
	    }

	    @Test
	    public void testDeleteProduct(){
	        Produit prod = new Produit();
	        produitService.deleteProduit(prod.getIdProduit());
	        verify(produitRepository, times(1)).deleteById(prod.getIdProduit());
	    }

	    @Test
	    public void testUpdateProduct(){
	        Produit prod = new Produit();
	        when(produitRepository.save(prod)).thenReturn(prod);
	        assertEquals(prod, produitService.updateProduit(prod));
	    }

	    @Test
	    public void testGetProduct(){
	        Produit prod = new Produit();
	        when(produitRepository.findById(prod.getIdProduit())).thenReturn(Optional.of(prod));
	        assertEquals(prod, produitService.retrieveProduit(prod.getIdProduit()));
	    }

}
