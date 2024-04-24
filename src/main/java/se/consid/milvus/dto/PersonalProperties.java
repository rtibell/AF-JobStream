package se.consid.milvus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Map;

@Data
@NoArgsConstructor
public class PersonalProperties {
    @JsonProperty("skills")
    private ArrayList<Map<String, Object>> skills;

    @JsonProperty("languages")
    private ArrayList<Map<String, Object>> languages;

    @JsonProperty("work_experiences")
    private ArrayList<Map<String, Object>> workExperiences;

    @JsonProperty("education")
    private ArrayList<Map<String, Object>> education;

    @JsonProperty("education_level")
    private ArrayList<Map<String, Object>> educationLevel;
}
