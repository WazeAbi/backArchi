package co.simplon.arski.arski.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.business.service.IProduitService;

@RestController
public class CreerProduitController {
    private IProduitService produitService;

    @PostMapping("/produits")
    public void ajouterProduit(@RequestBody ProduitDTO produit) {
        produitService.ajouterProduit(produit);
    }

    @Autowired
    public void setProduitService(IProduitService produitService) {
        this.produitService = produitService;
    }

}
