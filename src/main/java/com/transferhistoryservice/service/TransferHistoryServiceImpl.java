package com.transferhistoryservice.service;

import com.transferhistoryservice.model.TransferHistory;
import com.transferhistoryservice.repository.TransferHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferHistoryServiceImpl implements TransferHistoryService {

    @Autowired
    private TransferHistoryRepository historyRepository;

    @Override
    public List<TransferHistory> getAllTransferHistoryDetail() {
        return (List<TransferHistory>) historyRepository.findAll();
    }

    @Override
    public Optional<TransferHistory> getTransferHistoryDetailById(Long tId) {
        return historyRepository.findById(tId);
    }

    @Override
    public TransferHistory saveTransferHistoryDetail(TransferHistory transferHistory) {
        return historyRepository.save(transferHistory);
    }

    @Override
    public TransferHistory updateTransferHistoryDetail(Long tId, TransferHistory transferHistory) {
        return historyRepository.save(transferHistory);
    }

    @Override
    public void deleteTransferHistoryDetail(Long tId) {
        historyRepository.deleteById(tId);
    }
}
