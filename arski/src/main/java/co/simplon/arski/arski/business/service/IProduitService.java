package co.simplon.arski.arski.business.service;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.persistance.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public interface IProduitService {
    ProduitDTO recuperParId(final int id);
    void ajouterProduit( ProduitDTO produit);
    void modifierProduit( ProduitDTO produit);
    void supprimerProduit( ProduitDTO produit);
}
