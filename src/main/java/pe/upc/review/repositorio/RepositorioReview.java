package pe.upc.review.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.upc.review.entidad.Review;

public interface RepositorioReview extends JpaRepository<Review, Long>{

}
