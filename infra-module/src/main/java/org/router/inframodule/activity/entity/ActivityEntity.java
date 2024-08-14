package org.router.inframodule.activity.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Getter
@Entity
@Table(name = "activity")
@SQLDelete(sql = "UPDATE activity SET deleted_at = NOW() where activity_id = ?")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
