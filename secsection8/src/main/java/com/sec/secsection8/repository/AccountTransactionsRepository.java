package com.sec.secsection8.repository;


import java.util.List;

import com.sec.secsection8.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, String> {

    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId);

}