package com.seer;
import java.time.Instant;
import com.seer.AssetDto;

public record ReleaseDto (
    int id,
    String url,
    String htmlUrl,
    Instant publishedAt,
    Author author,
    String name,
    String tagName,
    List<AssetDto> assets
) {}