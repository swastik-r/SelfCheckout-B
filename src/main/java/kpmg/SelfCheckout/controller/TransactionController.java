package kpmg.SelfCheckout.controller;

import kpmg.SelfCheckout.model.Transaction;
import kpmg.SelfCheckout.repository.TransactionRepository;
import kpmg.SelfCheckout.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TransactionRepository transactionRepository;

    // Endpoints for the application

    @PostMapping("/create")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    // Endpoints for development

    @GetMapping("/all")
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @DeleteMapping("/delete/{transactionId}")
    public void deleteTransaction(@PathVariable("transactionId") Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllTransactions() {
        transactionRepository.deleteAll();
    }
}
