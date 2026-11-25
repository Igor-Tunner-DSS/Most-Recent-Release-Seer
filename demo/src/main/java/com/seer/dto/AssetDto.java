package com.seer;

public record AssetDto (
    int id,
    String downloadUrl,
    String label,
    String contentType,
    long sizeBytes
) {}