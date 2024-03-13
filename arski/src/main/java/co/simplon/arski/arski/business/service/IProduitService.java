package co.simplon.arski.arski.business.service;

import co.simplon.arski.arski.persistance.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public interface IProduitService {
    ProduitDto recuperParId(final int id);
    void ajouterProduit(ProduitDto produit);
    void modifierProduit(ProduitDto produit);
    void supprimerProduit(ProduitDto produit);
}
