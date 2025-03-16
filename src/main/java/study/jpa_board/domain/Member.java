package study.jpa_board.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String email;
}
