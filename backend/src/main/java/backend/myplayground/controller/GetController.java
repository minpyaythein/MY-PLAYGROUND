package backend.myplayground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import backend.myplayground.service.GetService;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import backend.myplayground.entity.Members;

@RestController
public class GetController {

    @Autowired
    GetService getService;

    @GetMapping("/getMembers")
    @ResponseStatus(HttpStatus.OK)
    public List<Members> getMembers(HttpServletRequest request) {
        return getService.getMembers();
    }

}