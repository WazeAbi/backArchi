package co.simplon.arski.arski.presentation.controller.produit;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.business.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ListerProduitController {
    private IProduitService produitService;

    @GetMapping("/produits")
    public List<ProduitDTO> listerProduits(){
        return produitService.listerProduits();
    }
    @Autowired
    public void setServiceProduit(IProduitService produitService) {
        this.produitService = produitService;
    }
}
