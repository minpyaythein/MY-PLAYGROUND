package backend.myplayground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import backend.myplayground.service.GetService;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import backend.myplayground.entity.Members;

@RestController
@CrossOrigin
public class GetController {

    @Autowired
    GetService getService;

    @GetMapping("/getMembers")
    public List<Members> getMembers(HttpServletRequest request) {
        return getService.getMembers();
    }

}