package co.simplon.arski.arski.business.service;

import co.simplon.arski.arski.business.convert.ProduitConvert;
import co.simplon.arski.arski.business.dto.ProduitDTO;
import co.simplon.arski.arski.persistance.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.simplon.arski.arski.persistance.repository.IProduitRepository;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService {
    private IProduitRepository repo;

    private ProduitConvert convert;

    @Override
    public List<ProduitDTO> listerProduits() {
        final List<Produit> result = repo.findAll();
        return ProduitConvert.getInstance().convertListProduitToProduitDTO(result);
    }

    @Override
    public ProduitDTO recuperParId(int id) {
        return convert.convertProduitToProduitDTO(repo.getReferenceById(id));
    }

    @Override
    public void ajouterProduit(ProduitDTO produit) {
        repo.save(convert.convertProduitDTOToProduit(produit));
    }

    @Override
    public void modifierProduit(ProduitDTO produit , int id ) {
        Produit produitToUpdate = convert.convertProduitDTOToProduit(produit);
        Produit produitExistant = repo.findById(id).orElse(null);
        if(produitExistant!= null) {
            produitExistant.setNom(produitToUpdate.getNom());
            produitExistant.setPrix(produitToUpdate.getPrix());
            produitExistant.setDescription(produitToUpdate.getDescription());
            produitExistant.setCategorie(produitToUpdate.getCategorie());
            produitExistant.setImage(produitToUpdate.getImage());
            repo.save(produitExistant);
        }

        }



    @Override
    public void supprimerProduit(int id) {
        repo.deleteById(id);
    }

    @Autowired
    public void setConvert(ProduitConvert convert) {
        this.convert = convert;
    }

    @Autowired
    public void setRepo(IProduitRepository repo) {
        this.repo = repo;
    }
}
