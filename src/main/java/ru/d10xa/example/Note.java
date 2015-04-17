package ru.d10xa.example;

import org.springframework.data.annotation.Id;

public class Note {

   @Id
   public String id;
   public String title;
   public String content;

   public Note(String title, String content) {
      this.title = title;
      this.content = content;
   }

}
