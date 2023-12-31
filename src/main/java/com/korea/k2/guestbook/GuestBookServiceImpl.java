package com.korea.k2.guestbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestBookServiceImpl implements GuestBookService {

	@Autowired
	private GuestBookDao dao;
	
	@Override
	public void insert(GuestBookVO vo) {
		dao.insert(vo);
	}

	@Override
	public void delete(GuestBookVO vo) {
		dao.delete(vo);
	}

	@Override
	public List<GuestBookVO> list(GuestBookVO vo) {
		return dao.list(vo);
	}

	@Override
	public void totalCount(GuestBookVO vo) {
		dao.totalCount(vo);
	}


}
