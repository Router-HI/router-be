package org.router.domainmodule.activity.service;

import lombok.RequiredArgsConstructor;
import org.router.domainmodule.activity.repository.ActivityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    public void test() {

    }
}
