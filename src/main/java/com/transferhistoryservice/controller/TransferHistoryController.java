package com.transferhistoryservice.controller;

import com.transferhistoryservice.model.TransferHistory;
import com.transferhistoryservice.service.TransferHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/transferhistory")
public class TransferHistoryController {

    @Autowired
    TransferHistoryService transferHistoryService;

    @GetMapping("/getAll")
    public List<TransferHistory> getAllHistoryDetail() {
        return transferHistoryService.getAllTransferHistoryDetail();
    }

    @GetMapping("/getById/{tid}")
    public Optional<TransferHistory> getHistoryById(@PathVariable Long tid) {
        return transferHistoryService.getTransferHistoryDetailById(tid);
    }

    @PostMapping("/save")
    public TransferHistory saveHistory(@RequestBody TransferHistory transferHistory) {
        return transferHistoryService.saveTransferHistoryDetail(transferHistory);
    }

    @PutMapping("/update/{tid}")
    public TransferHistory updateuser(@PathVariable Long tid, @RequestBody TransferHistory transferHistory) {
        return transferHistoryService.updateTransferHistoryDetail(tid, transferHistory);
    }

    @DeleteMapping("/delete/{tid}")
    public String deleteHistory(@PathVariable Long tid) {
        transferHistoryService.deleteTransferHistoryDetail(tid);
        return "Id : " + tid + "  Is Deleted";
    }

}
