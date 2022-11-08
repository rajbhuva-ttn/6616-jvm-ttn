package com.ttn.JPAWithHibernatePart3.OneToOneMapping.Controller;

import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Service.AuthorService;
import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity.AuthorOneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {

  @Autowired
  private AuthorService authorService;

  @RequestMapping(value = "/saveauthor", method = RequestMethod.POST)
  @ResponseBody
  public AuthorOneToOne saveAuthor(@RequestBody AuthorOneToOne author) {
    AuthorOneToOne authorResponse = authorService.saveAuthor(author);
    return authorResponse;
  }

  @RequestMapping(value = "/{authorId}", method = RequestMethod.GET)
  @ResponseBody
  public AuthorOneToOne getAuthorDetails(@PathVariable int authorId) {
    AuthorOneToOne authorResponse = authorService.findAuthorByAuthorId(authorId);
    return authorResponse;
  }
}
