package co.simplon.arski.arski.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.simplon.arski.arski.persistance.entity.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Integer> {
    @Query("select p from Produit p where p.nom = :nom")
    Produit recupereProduitParNom(final String nom);
}
