package com.seer;

import tools.jackson.annotation.JsonProperty;
import tools.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorDto (
    int id,
    @JsonProperty("login")
    string loginName,
    @JsonProperty("avatar_url")
    string avatarUrl,
    @JsonProperty("url")
    string profileUrl
) {}