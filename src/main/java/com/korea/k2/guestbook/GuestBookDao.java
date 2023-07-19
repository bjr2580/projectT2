package com.korea.k2.guestbook;

import java.util.List;

public interface GuestBookDao {

	void insert(GuestBookVO vo);
	void delete(GuestBookVO vo);
	void totalCount(GuestBookVO vo);
	List<GuestBookVO> list(GuestBookVO vo);
	
}
