package se.consid.milvus.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employer {
    private String phone_number;
    private String email;
    private String url;
    private String organization_number;
    private String name;
    private String workplace;
}
