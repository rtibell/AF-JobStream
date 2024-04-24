package se.consid.milvus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class JobListing {
    @JsonProperty
    private String id;

    @JsonProperty
    private String external_id;

    @JsonProperty
    private String original_id;

    @JsonProperty
    private String label;

    @JsonProperty
    private String webpage_url;

    @JsonProperty
    private String logo_url;

    @JsonProperty
    private String headline;

    @JsonProperty
    private String application_deadline;

    @JsonProperty
    private int number_of_vacancies;

    @JsonProperty
    private JobDescription description;

    @JsonProperty
    private EmploymentType employment_type;

    @JsonProperty
    private SalaryType salary_type;

    @JsonProperty
    private String salary_description;

    @JsonProperty
    private Duration duration;

    @JsonProperty
    private WorkingHoursType working_hours_type;

    @JsonProperty
    private ScopeOfWork scope_of_work;

    @JsonProperty
    private String access;

    @JsonProperty
    private Employer employer;

    @JsonProperty("application_details")
    private ApplicationDetails applicationDetails;

    @JsonProperty
    private boolean experience_required;

    @JsonProperty
    private boolean access_to_own_car;

    @JsonProperty("driving_license_required")
    private boolean drivingLicenseRequired;

    @JsonProperty("driving_license")
    private List<DrivingLicense> drivingLicense;


    @JsonProperty
    private Occupation occupation;

    @JsonProperty
    private OccupationGroup occupation_group;

    @JsonProperty
    private OccupationField occupation_field;

    @JsonProperty
    private WorkplaceAddress workplace_address;

    @JsonProperty("must_have")
    private PersonalProperties mustHave;

    @JsonProperty("nice_to_have")
    private PersonalProperties niceToHave;

    @JsonProperty("application_contacts")
    private List<ApplicationContact> applicationContacts;

    @JsonProperty
    private String publication_date;

    @JsonProperty
    private String last_publication_date;

    @JsonProperty
    private boolean removed;

    @JsonProperty
    private String removed_date;

    @JsonProperty
    private String source_type;

    @JsonProperty
    private long timestamp;


}
