package org.router.inframodule.activity.repository;

import lombok.RequiredArgsConstructor;
import org.router.domainmodule.activity.repository.ActivityRepository;
import org.router.inframodule.activity.repository.jpa.ActivityJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ActivityRepositoryImpl implements ActivityRepository {

    private final ActivityJpaRepository activityJpaRepository;

}
