package se.consid.milvus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDescription {
    private String text;
    private String text_formatted;
    private String company_information;
    private String needs;
    private String requirements;
    private String conditions;
}
