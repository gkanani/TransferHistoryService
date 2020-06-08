package com.transferhistoryservice.service;

import com.transferhistoryservice.model.TransferHistory;

import java.util.List;
import java.util.Optional;

public interface TransferHistoryService {

    List<TransferHistory> getAllTransferHistoryDetail();

    Optional<TransferHistory> getTransferHistoryDetailById(Long tId);

    TransferHistory saveTransferHistoryDetail(TransferHistory transferHistory);

    TransferHistory updateTransferHistoryDetail(Long tId, TransferHistory transferHistory);

    void deleteTransferHistoryDetail(Long tId);

}
