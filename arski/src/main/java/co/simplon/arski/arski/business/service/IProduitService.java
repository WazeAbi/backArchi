package co.simplon.arski.arski.business.service;

import co.simplon.arski.arski.business.dto.ProduitDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProduitService {
    List<ProduitDTO> listerProduits();
    ProduitDTO recuperParId(final int id);
    void ajouterProduit( ProduitDTO produit);
    void modifierProduit( ProduitDTO produit , int id);
    void supprimerProduit(int id);
}
