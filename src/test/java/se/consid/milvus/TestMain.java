package se.consid.milvus;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import se.consid.milvus.dto.JobListing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JobListing jobList1 = mapper.reader().forType(JobListing.class).readValue(JSON_EXAMPLE_1);
			List<JobListing> jobList2 = mapper.reader().forType(new TypeReference<List<JobListing>>() {}).readValue(JSON_EXAMPLE_2);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String JSON_EXAMPLE_1 = """
	{
		"id": "28746073",
		"external_id": "46-556074-3089-42438554",
		"original_id": null,
		"label": "[]",
		"webpage_url": "https://arbetsformedlingen.se/platsbanken/annonser/28746073",
		"logo_url": "https://www.arbetsformedlingen.se/rest/arbetsgivare/rest/af/v3/organisation/5560743089/logotyper/logo.png",
		"headline": "Group Product Manager - Customer Care",
		"application_deadline": "2024-05-08T23:59:59",
		"number_of_vacancies": 1,
		"description": {
			"text": "Who are we?\\nVolvo Cars is a company on a mission; to bring traditional car manufacturing into a connected, sustainable and smart future.\\nSince 1927, we have been a brand known for our commitment to safety, creating innovative cars that make life less complicated for our consumers. In 2010, we decided to transform our business, resulting in a totally new generation of cars and technologies, as well as steady growth and record sales. Today, we\u2019re expanding our global footprint in Europe, China and the US, and we\u2019re on the lookout for new talent. \\nWe are constantly pushing our own skills and abilities to drive change in the automobile industry like never before. We are looking for innovative, committed people to join us in this endeavour and create safe, sustainable and connected cars. We believe in the power of people and will challenge and support you to reach your full potential. Join us and be part of Volvo Cars\u2019 journey into the future.\\r\\n\\r\\nWe are looking for a Group\u00a0Product Manager to join our Customer Care Cluster. You will hire, coach, mentor & inspire Product Managers. Through them, you will develop and grow a sub-cluster for our Customer Care Core products.\u00a0\\n\\nAs part of this cluster, you will work with customer-centric product teams building a world-class customer care experience through digital self-service tools, retailer collaboration, and support agents that can leverage modern technology to serve our customers. You will be the voice of the product in the Product team through a friendly and effective collaboration with your Engineering and UX counterparts.\u00a0\\n\\nWhat you\u2019ll do\u00a0\u00a0\\nWithin the Customer Care & Support product cluster, you will oversee\u00a0our digital products with a goal to enable excellent customer care through an omnichannel approach which is backed up by capabilities enabling outstanding collaboration within and between our Care centers and our retailers in the markets.\\n\\nOmnichannel customer care and collaboration between Volvo Cars operational units and retailers are needed for many reasons, it can be an inquiry, complaint, or at delivery and return of a vehicle whenever a subscription is started or ended.\u00a0\\n\\nWhat you\u2019ll bring\u00a0\u00a0\\n  *  Experience leading Product teams and Product Managers in a Customer Care environment\u00a0\\n  *  Experience in Customer Care center operations at scale\\n  *  Effective communication/interpersonal skills and solid experience in managing both technical and commercial stakeholders\u00a0\u00a0Ability to balance needs of stakeholders, developers and end-users\u00a0\u00a0\\n  *  Strategic mindset with the ability to manage long-term roadmaps while also having a key eye for details\u00a0\u00a0\\n  *  Someone who thrives when things are complex and finds a way to make things happen\u00a0\\n  *  Extensive analytical skills\u00a0\u00a0\\n  *  Bachelor's degree in business, technology or equivalent\u00a0\\n\\n\\nLocation\\nStockholm Tech Hub or HQ Gothenburg. The product teams are mainly based out of Gothenburg or Stockholm, working in a global and fast-paced environment where collaboration across geography, operational disciplines, and technology stacks needs to happen.",
			"text_formatted": "Who are we?\\nVolvo Cars is a company on a mission; to bring traditional car manufacturing into a connected, sustainable and smart future.\\nSince 1927, we have been a brand known for our commitment to safety, creating innovative cars that make life less complicated for our consumers. In 2010, we decided to transform our business, resulting in a totally new generation of cars and technologies, as well as steady growth and record sales. Today, we\u2019re expanding our global footprint in Europe, China and the US, and we\u2019re on the lookout for new talent. \\nWe are constantly pushing our own skills and abilities to drive change in the automobile industry like never before. We are looking for innovative, committed people to join us in this endeavour and create safe, sustainable and connected cars. We believe in the power of people and will challenge and support you to reach your full potential. Join us and be part of Volvo Cars\u2019 journey into the future.\\r\\n\\r\\nWe are looking for a Group\u00a0Product Manager to join our Customer Care Cluster. You will hire, coach, mentor &amp; inspire Product Managers. Through them, you will develop and grow a sub-cluster for our Customer Care Core products.\u00a0\\n\\nAs part of this cluster, you will work with customer-centric product teams building a world-class customer care experience through digital self-service tools, retailer collaboration, and support agents that can leverage modern technology to serve our customers. You will be the voice of the product in the Product team through a friendly and effective collaboration with your Engineering and UX counterparts.\u00a0\\n\\nWhat you\u2019ll do\u00a0\u00a0\\nWithin the Customer Care &amp; Support product cluster, you will oversee\u00a0our digital products with a goal to enable excellent customer care through an omnichannel approach which is backed up by capabilities enabling outstanding collaboration within and between our Care centers and our retailers in the markets.\\n\\nOmnichannel customer care and collaboration between Volvo Cars operational units and retailers are needed for many reasons, it can be an inquiry, complaint, or at delivery and return of a vehicle whenever a subscription is started or ended.\u00a0\\n\\nWhat you\u2019ll bring\u00a0\u00a0\\n  *  Experience leading Product teams and Product Managers in a Customer Care environment\u00a0\\n  *  Experience in Customer Care center operations at scale\\n  *  Effective communication/interpersonal skills and solid experience in managing both technical and commercial stakeholders\u00a0\u00a0Ability to balance needs of stakeholders, developers and end-users\u00a0\u00a0\\n  *  Strategic mindset with the ability to manage long-term roadmaps while also having a key eye for details\u00a0\u00a0\\n  *  Someone who thrives when things are complex and finds a way to make things happen\u00a0\\n  *  Extensive analytical skills\u00a0\u00a0\\n  *  Bachelor's degree in business, technology or equivalent\u00a0\\n\\n\\nLocation\\nStockholm Tech Hub or HQ Gothenburg. The product teams are mainly based out of Gothenburg or Stockholm, working in a global and fast-paced environment where collaboration across geography, operational disciplines, and technology stacks needs to happen.",
			"company_information": null,
			"needs": null,
			"requirements": null,
			"conditions": "Full Time\\r\\nPermanent"
		},
		"employment_type": {
			"concept_id": "PFZr_Syz_cUq",
			"label": "Vanlig anst\u00e4llning",
			"legacy_ams_taxonomy_id": "1"
		},
		"salary_type": {
			"concept_id": "oG8G_9cW_nRf",
			"label": "Fast m\u00e5nads- vecko- eller timl\u00f6n",
			"legacy_ams_taxonomy_id": "1"
		},
		"salary_description": "Undefined",
		"duration": {
			"concept_id": "a7uU_j21_mkL",
			"label": "Tills vidare",
			"legacy_ams_taxonomy_id": "1"
		},
		"working_hours_type": {
			"concept_id": "6YE1_gAC_R2G",
			"label": "Heltid",
			"legacy_ams_taxonomy_id": "1"
		},
		"scope_of_work": {
			"min": 100,
			"max": 100
		},
		"access": null,
		"employer": {
			"phone_number": null,
			"email": null,
			"url": "https://www.volvocars.com/",
			"organization_number": "5560743089",
			"name": "Volvo Personvagnar AB",
			"workplace": "Volvo Car Corporation"
		},
		"application_details": {
			"information": "Ans\u00f6kan skickas till: VAK building, Assar Gabrielssons v\u00e4g, G\u00f6teborg, SE",
			"reference": "69821-42438554",
			"email": null,
			"via_af": false,
			"url": "https://volvo-car-corporation.contactrh.com/jobs/9669/42438554",
			"other": null
		},
		"experience_required": true,
		"access_to_own_car": false,
		"driving_license_required": false,
		"driving_license": null,
		"occupation": {
			"concept_id": "32bC_YdL_JtU",
			"label": "Produktutvecklare",
			"legacy_ams_taxonomy_id": "161"
		},
		"occupation_group": {
			"concept_id": "mp2Y_vyC_RFV",
			"label": "\u00d6vriga civilingenj\u00f6rsyrken",
			"legacy_ams_taxonomy_id": "2149"
		},
		"occupation_field": {
			"concept_id": "6Hq3_tKo_V57",
			"label": "Yrken med teknisk inriktning",
			"legacy_ams_taxonomy_id": "18"
		},
		"workplace_address": {
			"municipality": "Stockholm",
			"municipality_code": "0180",
			"municipality_concept_id": "AvNB_uwa_6n6",
			"region": "Stockholms l\u00e4n",
			"region_code": "01",
			"region_concept_id": "CifL_Rzy_Mku",
			"country": "Sverige",
			"country_code": "199",
			"country_concept_id": "i46j_HmG_v64",
			"street_address": null,
			"postcode": null,
			"city": null,
			"coordinates": [
				18.06858,
				59.329323
			]
		},
		"must_have": {
			"skills": [

			],
			"languages": [

			],
			"work_experiences": [
				{
					"weight": 10,
					"concept_id": "32bC_YdL_JtU",
					"label": "Produktutvecklare",
					"legacy_ams_taxonomy_id": "161"
				}
			],
			"education": [

			],
			"education_level": [

			]
		},
		"nice_to_have": {
			"skills": [

			],
			"languages": [

			],
			"work_experiences": [

			],
			"education": [

			],
			"education_level": [

			]
		},
		"application_contacts": [
			{
				"name": "Jonas Berglin",
				"description": null,
				"email": null,
				"telephone": "+46 31590000",
				"contact_type": null
			}
		],
		"publication_date": "2024-04-24T14:27:02",
		"last_publication_date": "2024-05-08T23:59:59",
		"removed": false,
		"removed_date": null,
		"source_type": "VIA_PLATSBANKEN_DXA",
		"timestamp": 1713965113220
	}
    """;

	private static final String JSON_EXAMPLE_2 = "[" + JSON_EXAMPLE_1 + "]";
}
