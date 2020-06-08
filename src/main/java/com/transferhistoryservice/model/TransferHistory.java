package com.transferhistoryservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class TransferHistory {

    @Id
    private Long transferId;
    private Long userId;
    private String transferType;
    private Integer beforeBalance;
    private Integer afterBalance;
    private Integer amount;
    private Long externalTransferId;
    private String note;
    private String createTime;

}
