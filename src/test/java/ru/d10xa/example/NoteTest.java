package ru.d10xa.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class NoteTest {

   @Autowired NoteRepository noteRepository;

   @Test
   public void testName() {
      noteRepository.save(new Note("some title","hello world"));
      assertThat(noteRepository.count(),is(1L));
   }

}
