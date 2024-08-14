package org.router.inframodule.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Getter
@Entity
@Table(name = "member")
@SQLDelete(sql = "UPDATE member SET deleted_at = NOW() where member_id = ?")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, columnDefinition = "varchar(320)")
    private String email;

    // OAuth 연결하게 된다면, 미사용할 수 있으므로 nullable = true 설정
    @Column(name = "password", columnDefinition = "varchar(255)")
    private String password;

    private String name;
}
