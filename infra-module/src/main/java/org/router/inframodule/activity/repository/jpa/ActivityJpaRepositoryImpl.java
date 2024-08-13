package org.router.inframodule.activity.repository.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ActivityJpaRepositoryImpl implements ActivityJpaRepositoryCustom {

    private final JPAQueryFactory queryFactory;
}
