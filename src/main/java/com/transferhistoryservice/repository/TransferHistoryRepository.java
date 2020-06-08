package com.transferhistoryservice.repository;

import com.transferhistoryservice.model.TransferHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferHistoryRepository extends MongoRepository<TransferHistory, Long> {
}
