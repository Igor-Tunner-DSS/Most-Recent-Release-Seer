import com.seer.ReleaseDto;
import java.time.Instant;
package com.seer;

public record ResponseDto(
    List<ReleaseDto> body,
    Instant fetchedAt,
    int limit
) {}