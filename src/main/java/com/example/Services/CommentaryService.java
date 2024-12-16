package com.example.Services;

import com.example.Entities.Commentary;
import com.example.Repositories.ICommentaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaryService {

    @Autowired
    ICommentaryRepository commentaryRepository;


    //Create
    public Commentary saveCommentary(Commentary commentary){
        return commentaryRepository.save(commentary);
    }


    //Show one
    public Optional<Commentary> findCommentaryById(Long id) {
        return commentaryRepository.findById(id);
    }



    //Show all
    public List<Commentary> findAll() {
        return commentaryRepository.findAll();
    }


    //Update
    public Commentary updateCommentary(Commentary commentary){
        return commentaryRepository.save(commentary);
    }


    //Delete
    public void deleteCommentary(Long id){
         commentaryRepository.deleteById(id);
    }
}
