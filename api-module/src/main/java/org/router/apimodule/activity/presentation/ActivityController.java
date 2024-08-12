package org.router.apimodule.activity.presentation;

import lombok.RequiredArgsConstructor;
import org.router.apimodule.activity.application.ActivityFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityFacade activityFacade;
}
