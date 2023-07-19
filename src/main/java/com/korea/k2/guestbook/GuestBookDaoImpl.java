package com.korea.k2.guestbook;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class GuestBookDaoImpl implements GuestBookDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public void insert(GuestBookVO vo) {
		mybatis.insert("GuestBook.INSERT", vo);
	}

	@Override
	public void delete(GuestBookVO vo) {
		mybatis.delete("GuestBook.DELETE", vo);
	}

	@Override
	public List<GuestBookVO> list(GuestBookVO vo) {
		return mybatis.selectList("GuestBook.SELECT", vo);
	}

	@Override
	public void totalCount(GuestBookVO vo) {
		mybatis.selectOne("GuestBook.TOTALCOUNT");
	}


}
