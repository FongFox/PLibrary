package com.plibrary.service;

import com.plibrary.dto.AddBookRequest;

public interface IAdminService {
    public void increaseBookQuantity(Long bookId) throws Exception;
    public void decreaseBookQuantity(Long bookId) throws Exception;
    public void postBook(AddBookRequest addBookRequest);
    public void deleteBook(Long bookId) throws Exception;
}
