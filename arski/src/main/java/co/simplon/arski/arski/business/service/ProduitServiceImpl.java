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
    public void modifierProduit(ProduitDTO produit) {
        repo.save(convert.convertProduitDTOToProduit(produit));
    }

    @Override
    public void supprimerProduit(ProduitDTO produit) {
        repo.delete(convert.convertProduitDTOToProduit(produit));
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
