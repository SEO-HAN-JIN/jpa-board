package study.jpa_board.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(length = 200, nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    private int viewCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Embedded
    private PostMetadata postMetadata;

    @OneToMany(mappedBy = "post")
    private List<PostTag> postTags = new ArrayList<>();

    // 연관관계 메서드 (단방향)
    public void setMember(Member member) {
        this.member = member;
    }

}
