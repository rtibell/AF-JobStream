package se.consid.milvus.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApplicationDetails {
    private String information;
    private String reference;
    private String email;
    private boolean via_af;
    private String url;
    private String other;
}
