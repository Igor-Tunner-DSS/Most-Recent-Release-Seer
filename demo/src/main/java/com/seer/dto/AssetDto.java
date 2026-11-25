package com.seer;

import tools.jackson.annotation.JsonProperty;
import tools.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AssetDto (
    int id,
    @JsonProperty("browser_download_url")
    String downloadUrl,
    @JsonProperty("name")
    String label,
    @JsonProperty("content_type")
    String contentType,
    @JsonProperty("size")
    long sizeBytes
) {}