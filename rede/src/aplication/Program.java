package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat stf = new SimpleDateFormat("ddd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that�s awsome!");
		Post p1 = new Post(stf.parse("21/06/2020 13:05:44"),
				"Traveling to new zealand",
				"I�m going to visit this wonderful country!", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);
	}

}
