package com.howtodoinjava.demo.web.controller;

import com.howtodoinjava.demo.web.service.ItemService;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO : this class is a Rest Controller
//TODO : the endpoint is "/items"
@SuppressWarnings("all")
public class ItemController {

  @Autowired
  ItemService itemService;

  //TODO : check http status code and return items and catch if server error : use GetMapping

}
