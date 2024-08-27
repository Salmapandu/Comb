package com.example.COSOZA.Registration.Repository;

import com.example.COSOZA.Registration.Entity.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {
}
