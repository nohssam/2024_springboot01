package com.ict.edu2.domain.guestbook.service;

import java.util.List;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

public interface GuestBookService {
    public List<GuestBookVO> getGuestBookList();

    public GuestBookVO getGuestBookDetail(String gb_idx);
}
