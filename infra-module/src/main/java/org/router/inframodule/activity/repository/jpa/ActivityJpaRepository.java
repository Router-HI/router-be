package org.router.inframodule.activity.repository.jpa;

import org.router.inframodule.activity.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityJpaRepository extends JpaRepository<Activity, Long> {
}
