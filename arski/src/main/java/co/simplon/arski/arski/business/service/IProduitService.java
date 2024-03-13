package co.simplon.arski.arski.business.service;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.persistance.entity.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProduitService {
    List<ProduitDTO> listerProduits();
    ProduitDTO recuperParId(final int id);
    void ajouterProduit( ProduitDTO produit);
    void modifierProduit( ProduitDTO produit);
    void supprimerProduit( ProduitDTO produit);
}
