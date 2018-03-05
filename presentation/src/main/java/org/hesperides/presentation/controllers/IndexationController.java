package org.hesperides.presentation.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.hesperides.application.IndexUsesCases;
import org.hesperides.domain.security.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api("/replay")
@RestController
@RequestMapping("/replay")
public class IndexationController extends BaseController {

    private final IndexUsesCases indexUsesCases;

    @Autowired
    public IndexationController(IndexUsesCases indexUsesCases) {
        this.indexUsesCases = indexUsesCases;
    }

    @PostMapping()
    @ApiOperation("Reindex all applications, modules, templates...")
    //@PreAuthorize("hasRole('" + UserRole.PROD + "') and hasRole('" + UserRole.TECH + "')")
    public void replay() {
        log.info("Replay started");
        indexUsesCases.replay();
        log.info("Replay finished");
    }

}
