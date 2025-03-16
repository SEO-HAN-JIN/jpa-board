package study.jpa_board.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostMetadata {

    @Column(length = 45)
    private String ipAddress;

    @Column(length = 45)
    private String deviceType;

    @Column(length = 100)
    private String location;
}
