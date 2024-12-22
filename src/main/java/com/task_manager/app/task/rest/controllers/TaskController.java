package com.task_manager.app.task.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * TaskController
 */
@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping(path = "/v1/task")
public class TaskController {

}
