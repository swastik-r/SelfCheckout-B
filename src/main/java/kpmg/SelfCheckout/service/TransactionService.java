package kpmg.SelfCheckout.service;

import kpmg.SelfCheckout.model.Transaction;
import kpmg.SelfCheckout.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
