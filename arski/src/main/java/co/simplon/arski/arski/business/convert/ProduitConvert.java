package co.simplon.arski.arski.business.convert;


import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.persistance.entity.Produit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduitConvert {
    private static ProduitConvert instance;
    private ProduitConvert(){

    }
    public static ProduitConvert getInstance(){
        if (instance == null)
            instance = new ProduitConvert();
        return instance;
    }
    public Produit convertProduitDTOToProduit(ProduitDTO produitDTO){
        Produit produit = new Produit();
        produit.setId(produitDTO.getId());
        produit.setNom(produitDTO.getNom());
        produit.setPrix(produitDTO.getPrix());
        produit.setDescription(produitDTO.getDescription());
        produit.setCategorie(produitDTO.getCategorie());
        produit.setImage(produitDTO.getImage());
        return produit;
    }
    public ProduitDTO convertProduitToProduitDTO(Produit produit){
        ProduitDTO produitDTO = new ProduitDTO();
        produitDTO.setId(produit.getId());
        produitDTO.setNom(produit.getNom());
        produitDTO.setPrix(produit.getPrix());
        produitDTO.setDescription(produit.getDescription());
        produitDTO.setCategorie(produit.getCategorie());
        produitDTO.setImage(produit.getImage());
        return produitDTO;
    }
    public List<Produit> convertListDTOTOProduit (final List<ProduitDTO> ListProduitDTO){
        final List<Produit> ListProduit = new ArrayList<>();
        for (ProduitDTO produitDTO : ListProduitDTO) {
            ListProduit.add(convertProduitDTOToProduit(produitDTO));
        }
        return ListProduit;
    }
    public List<ProduitDTO> convertListProduitToProduitDTO(final List<Produit> ListProduit){
        final List<ProduitDTO> ListProduitDto = new ArrayList<>();
        for (Produit produit : ListProduit) {
            ListProduitDto.add(convertProduitToProduitDTO(produit));
        }
        return ListProduitDto;
    }
}
