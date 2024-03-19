package co.simplon.arski.arski.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.business.service.IProduitService;

@RestController
@CrossOrigin
public class RecupererProduitController {
    private IProduitService produitService;

    @GetMapping("/produits/{id}")
    public ProduitDTO recupererParId(@PathVariable Integer id) {
        return produitService.recuperParId(id);
    }

    @Autowired
    public void setProduitService(IProduitService produitService) {
        this.produitService = produitService;
    }
}
