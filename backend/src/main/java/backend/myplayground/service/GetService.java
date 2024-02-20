package backend.myplayground.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.myplayground.entity.Members;
import backend.myplayground.repository.MembersRepository;

@Service
public class GetService {

    @Autowired
    MembersRepository membersRepository;

    public List<Members> getMembers() {
        return membersRepository.findAll();
    }

}
