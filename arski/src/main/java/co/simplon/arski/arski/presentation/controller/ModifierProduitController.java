package co.simplon.arski.arski.presentation.controller;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.business.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ModifierProduitController {
    private IProduitService produitService;

    @PutMapping("/produits/{id}")
    public void modifierProduit(@PathVariable Integer id, @RequestBody ProduitDTO produitDTO){
        produitService.modifierProduit(produitDTO , id);
    }

    @Autowired
    public void setProduitService(IProduitService produitService) {
        this.produitService = produitService;
    }
}
