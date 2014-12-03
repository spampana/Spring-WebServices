package com.helpezee.service;

//import com.aranin.weblog4j.hashdb.HashDB;
import com.helpezee.model.BookVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class BookService {

	protected final Logger log = LoggerFactory.getLogger(BookService.class);
	private HashMap<String,BookVO> map;
	
	
	public BookService(){
	map= new HashMap<String,BookVO> ();
	BookVO vo= new BookVO();
	vo.setAuthor("satya");
	vo.setBookName("satya");
	vo.setBookId(1);
	map.put("satya", vo);
	}

	@POST
	@Path("/getbook/{name}")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json",
			"application/x-www-form-urlencoded" })
	public Response getBucket(@PathParam("name") String name) {
		log.debug("name : " + name);
		BookVO bookVO = null;
		//bookVO = HashDB.getBook(URLDecoder.decode(name, "UTF-8"));
		bookVO = map.get(name);
		System.out.println(bookVO.toString());

		if (bookVO == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} else {
			return Response.ok(bookVO).build();
		}
	}

	@POST
	@Path("/addbook")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json",
			"application/x-www-form-urlencoded" })
	public Response addBook(@FormParam("name") String bookName,
			@FormParam("author") String author) {
		log.debug("inside addBook");
		BookVO bookVO = new BookVO();
		bookVO.setBookName(bookName);
		bookVO.setAuthor(author);
		map.put(bookVO.getBookName(),bookVO);
		if (map.get(bookName) == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} else {
			return Response.ok(bookVO).build();
		}

	}
}