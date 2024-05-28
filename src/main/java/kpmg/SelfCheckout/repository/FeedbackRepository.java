package kpmg.SelfCheckout.repository;

import kpmg.SelfCheckout.dto.FeedbackRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<FeedbackRequest, Long> {
}
