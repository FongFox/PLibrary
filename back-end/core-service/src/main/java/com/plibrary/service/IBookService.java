package com.plibrary.service;

import com.plibrary.dto.ShelfCurrentLoansResponse;
import com.plibrary.entity.Book;

import java.util.List;

public interface IBookService {
    public Book checkoutBook (String userEmail, Long bookId) throws Exception;

    public Boolean checkoutBookByUser(String userEmail, Long bookId);

    public int currentLoansCount(String userEmail);

    public List<ShelfCurrentLoansResponse> currentLoans(String userEmail) throws Exception;

    public void returnBook (String userEmail, Long bookId) throws Exception;

    public void renewLoan(String userEmail, Long bookId) throws Exception;
}
