package kpmg.SelfCheckout.repository;

import kpmg.SelfCheckout.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction save(Transaction transaction);
    boolean existsByTransactionId(String transactionId);
    void deleteById(Long transactionId);

}