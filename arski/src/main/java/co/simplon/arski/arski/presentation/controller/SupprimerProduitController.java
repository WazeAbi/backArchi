package co.simplon.arski.arski.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.simplon.arski.arski.business.service.IProduitService;
@RestController
public class SupprimerProduitController {
    private IProduitService produitService;
    @DeleteMapping("/produits/{id}")
    public void supprimerProduit(@PathVariable Integer id){
        produitService.supprimerProduit(id);
    }
   @Autowired
   public void setProduitService(IProduitService produitService) {
        this.produitService = produitService;
    }
}
