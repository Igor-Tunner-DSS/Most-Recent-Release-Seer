package com.seer;
import java.time.Instant;
import com.seer.AssetDto;
import com.seer.AuthorDto;
import tools.jackson.annotation.JsonProperty;
import tools.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ReleaseDto (
    int id,
    String url,
    @JsonProperty("html_url")
    String htmlUrl,
    @JsonProperty("published_at")
    Instant publishedAt,
    AuthorDto author,
    String name,
    @JsonProperty("tag_name")
    String tagName,
    List<AssetDto> assets
) {
    public boolean CheckStatus() {
        // to be implemented
    }
}